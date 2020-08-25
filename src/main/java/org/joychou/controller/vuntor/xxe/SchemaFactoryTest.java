package org.joychou.controller.vuntor.xxe;

import javax.xml.transform.TransformerFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class SchemaFactoryTest {
    public void test() {
        try {
            SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        } catch (Exception e) {
        }
    }
}
