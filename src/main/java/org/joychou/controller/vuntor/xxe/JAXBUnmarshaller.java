package org.joychou.controller.vuntor.xxe;

import java.io.StringReader;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;

import org.xml.sax.InputSource;

public class JAXBUnmarshaller {
    public void test() {
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            Source xmlSource = new SAXSource(spf.newSAXParser().getXMLReader(),
                    new InputSource(new StringReader("")));
        } catch (Exception e) {
        }
    }
}
