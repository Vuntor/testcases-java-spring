package org.joychou.controller.vuntor.expr.ognl;

import ognl.Ognl;

public class Main {
    public void test() {
        try {
            Ognl.parseExpression("");
        } catch (Exception e) {
        }
    }
}
