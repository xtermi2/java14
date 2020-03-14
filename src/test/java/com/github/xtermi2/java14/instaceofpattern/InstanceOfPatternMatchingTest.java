package com.github.xtermi2.java14.instaceofpattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InstanceOfPatternMatchingTest {

    @Test
    void instaceOfTest() {
        String msg = "msg";

        String res = new InstanceOfPatternMatching().instaceOfTest(msg);

        assertThat(res)
                .endsWith(String.valueOf(msg.length()));
    }
}