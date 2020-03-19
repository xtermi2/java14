package com.github.xtermi2.java14.switchexpressions;

public class SwitchExpressions {

    public boolean isWeekend(WeekDay day) {
        boolean weekend = switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
            case SATURDAY, SUNDAY -> true;
        };
        return weekend;
    }

    public int dayNumber(WeekDay day) {
        return switch (day) {
            case MONDAY -> 1;
            case TUESDAY -> 2;
            default -> {
                // do something
                // new yield statement to yield a value, which becomes the value of the enclosing switch expression.
                yield -1;
            }
        };
    }

    public enum WeekDay {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}
