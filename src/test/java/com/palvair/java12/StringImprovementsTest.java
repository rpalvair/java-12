package com.palvair.java12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StringImprovementsTest {

    private static final String SAMPLE = "Hello;World;";

    @Test
    public void should_transform_string_in_list_of_string() {
        final List<String> transform = SAMPLE.transform(s -> Arrays.asList(s.split(";")));

        assertThat(transform).isNotNull()
                .containsExactly("Hello", "World");
    }

}