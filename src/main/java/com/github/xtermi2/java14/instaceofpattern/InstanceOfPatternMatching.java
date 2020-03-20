package com.github.xtermi2.java14.instaceofpattern;

public class InstanceOfPatternMatching {

    public String instaceOfTest(Object msg) {
        if (msg instanceof String s) {
            return "this is the poor man's smart-cast feature from kotlin: " + s.length();
        } else {
            return "";
        }
    }
}
