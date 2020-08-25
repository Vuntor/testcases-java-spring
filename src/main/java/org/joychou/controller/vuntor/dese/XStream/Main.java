package org.joychou.controller.vuntor.dese.XStream;

import com.thoughtworks.xstream.XStream;

import java.net.URL;

public class Main {
    public void test() {
        try {
            XStream xstream = new XStream();
            xstream.fromXML(new URL("http://localhost"));
        } catch (Exception e) {
        }
    }
}
