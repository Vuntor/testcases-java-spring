package org.joychou.controller.vuntor.xxe;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;

import java.io.File;

public class SAXBuilderTest {
    public void test() {
        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new File("1.xml"));
        } catch (Exception e) {
        }
    }
}
