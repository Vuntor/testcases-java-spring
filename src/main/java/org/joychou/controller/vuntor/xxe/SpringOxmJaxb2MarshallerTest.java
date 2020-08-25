package org.joychou.controller.vuntor.xxe;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.io.StringReader;

import javax.xml.transform.stream.StreamSource;

public class SpringOxmJaxb2MarshallerTest {
    public void test() {
        try {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.unmarshal(new StreamSource(new StringReader("")));
        } catch (Exception e) {
        }
    }
}
