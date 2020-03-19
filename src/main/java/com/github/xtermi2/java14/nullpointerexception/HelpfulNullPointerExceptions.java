package com.github.xtermi2.java14.nullpointerexception;

import java.util.logging.Logger;

public class HelpfulNullPointerExceptions {

    private static final Logger logger = Logger.getLogger(HelpfulNullPointerExceptions.class.getName());
    private A a = new A();

    public static void main(String[] args) {
        new HelpfulNullPointerExceptions().info(null);
    }

    public String info(Object msg) {
        if (msg == null) {
            msg = a.b.c.s;
        }
        return buildInfo(msg.toString(), logger);
    }

    private String buildInfo(String msg, Logger logger) {
        logger.info(msg);
        return msg;
    }

    public static class A {
        public B b;
    }

    public static class B {
        public C c;
    }

    public static class C {
        public String s;
    }
}
