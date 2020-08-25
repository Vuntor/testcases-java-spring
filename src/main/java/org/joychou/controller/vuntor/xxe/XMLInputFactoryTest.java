package org.joychou.controller.vuntor.xxe;

import java.io.ByteArrayInputStream;

import javax.xml.stream.XMLInputFactory;

public class XMLInputFactoryTest {
    public void test() {
        try {
            XMLInputFactory dbf = XMLInputFactory.newInstance();
            dbf.createXMLStreamReader(new ByteArrayInputStream(new byte[]{}));
        } catch (Exception e) {
        }
    }
}
