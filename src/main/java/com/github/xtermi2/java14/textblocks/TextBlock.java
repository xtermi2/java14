package com.github.xtermi2.java14.textblocks;

import java.time.LocalDate;

public class TextBlock {

    private String jsonTemplate =
            """
            {
              "id": 12345
              "name": "foo"
              "date": "%s"
            }""";

    public String create(LocalDate date) {
        return String.format(jsonTemplate, date.toString());
    }
}
