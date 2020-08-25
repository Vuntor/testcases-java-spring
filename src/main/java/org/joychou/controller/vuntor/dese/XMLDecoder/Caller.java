package org.joychou.controller.vuntor.dese.XMLDecoder;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Caller {
    static public void main(String[] args) {
        try {
            User u = new User("Jack", 22);
            String tmpfile = "xmldecoder.tmp";

            // write
            FileOutputStream fos = new FileOutputStream(tmpfile);
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(u);
            encoder.close();
            fos.close();

            // read
            FileInputStream fis = new FileInputStream(tmpfile);
            XMLDecoder decoder = new XMLDecoder(fis);
            User u2 = (User)decoder.readObject();
            decoder.close();
            fis.close();

            System.out.println(u2.getName());

            // clear
            Files.deleteIfExists(Paths.get(tmpfile));
        } catch (Exception e) {
        }
    }
}
