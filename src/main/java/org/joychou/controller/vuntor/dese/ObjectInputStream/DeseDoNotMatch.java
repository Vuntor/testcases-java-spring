package org.joychou.controller.vuntor.dese.ObjectInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeseDoNotMatch implements Serializable {

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        in.readObject();
    }
}
