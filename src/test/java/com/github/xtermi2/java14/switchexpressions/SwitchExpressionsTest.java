package com.github.xtermi2.java14.switchexpressions;

import org.junit.jupiter.api.Test;

import static com.github.xtermi2.java14.switchexpressions.SwitchExpressions.WeekDay.FRIDAY;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchExpressionsTest {

    private SwitchExpressions underTest = new SwitchExpressions();

    @Test
    void isWeekend() {
        assertThat(underTest.isWeekend(FRIDAY))
                .isFalse();
    }

    @Test
    void dayNumber() {
        assertThat(underTest.dayNumber(FRIDAY))
                .isEqualTo(-1);
    }
}