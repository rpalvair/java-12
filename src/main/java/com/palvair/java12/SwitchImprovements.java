package com.palvair.java12;

import java.time.DayOfWeek;

public class SwitchImprovements {


    public String getMessage(final DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY,TUESDAY,WEDNESDAY, THURSDAY -> "Stay focus";
            case FRIDAY -> "It's friday!";
            default -> "Life is good!";
        };
    }
}
