package org.joychou.controller.vuntor.dese.HessianBurlap;

import com.caucho.burlap.io.BurlapInput;

import java.io.ByteArrayInputStream;

public class Main {
    public void test() {
        try {
            BurlapInput in = new BurlapInput(new ByteArrayInputStream(new byte[]{}));
        } catch (Exception e) {
        }
    }
}
