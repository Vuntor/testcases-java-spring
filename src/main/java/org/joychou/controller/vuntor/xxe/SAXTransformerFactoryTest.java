package org.joychou.controller.vuntor.xxe;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;

public class SAXTransformerFactoryTest {
    public void test() {
        try {
            TransformerFactory sf = SAXTransformerFactory.newInstance();
        } catch (Exception e) {
        }
    }
}
