package org.joychou.controller.vuntor.dese.ObjectInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dese {
    ObjectInputStream m_ois = null;

    public void test() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(new byte[]{}));
            ois.readObject();
        } catch (Exception e) {
        }
    }

    public void test2() {
        try {
            MyObjectInputStream ois = new MyObjectInputStream2(new ByteArrayInputStream(new byte[]{}));
        } catch (Exception e) {
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        in.readObject();
    }
}
