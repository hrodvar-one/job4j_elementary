package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LogicNotTest {
    @Test
    void whenNum7ThenTrue() {
        int in = 7;
        boolean result = LogicNot.notEvenAndPositive(in);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNum8ThenTrue() {
        int in = 8;
        boolean result = LogicNot.evenOrNotPositive(in);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }
}