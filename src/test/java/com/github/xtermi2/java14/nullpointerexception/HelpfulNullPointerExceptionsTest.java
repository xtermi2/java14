package com.github.xtermi2.java14.nullpointerexception;

import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class HelpfulNullPointerExceptionsTest {

    private static final Logger logger = Logger.getLogger(HelpfulNullPointerExceptionsTest.class.getName());

    private HelpfulNullPointerExceptions underTest = new HelpfulNullPointerExceptions();

    @Test
    void no_exception() {
        String msg = "OK";

        String res = underTest.info(msg);

        assertThat(res)
                .isEqualTo(msg);
    }

    @Test
    void expect_nullpointer_exception() {
        Throwable throwable = catchThrowable(() -> underTest.info(null));

        logger.log(Level.SEVERE, "message=" + throwable.getMessage(), throwable);

        assertThat(throwable)
                .isInstanceOf(NullPointerException.class)
                .hasMessage("Cannot read field \"c\" because \"this.a.b\" is null");
    }
}