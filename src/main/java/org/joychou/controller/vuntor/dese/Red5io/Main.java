package org.joychou.controller.vuntor.dese.Red5io;

import org.apache.mina.core.buffer.IoBuffer;
import org.red5.io.object.Deserializer;
import org.red5.io.amf.Input;

public class Main {
    public void test() {
        try {
            Deserializer.deserialize(new Input(IoBuffer.allocate(1)), Main.class);
        } catch (Exception e) {
        }
    }
}
