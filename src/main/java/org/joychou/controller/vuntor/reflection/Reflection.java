package org.joychou.controller.vuntor.reflection;

public class Reflection {
    public void classLoader() {
        try {
            Reflection.class.getClassLoader().loadClass("asdf");
        } catch (Exception e) {
        }
    }

    public void forName() {
        try {
            Class.forName("asdf");
        } catch (Exception e) {
        }
    }
}
