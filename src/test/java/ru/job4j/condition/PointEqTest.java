package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PointEqTest {
    @Test
    void whenX13Y14X23Y25ThenTrue() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 3;
        int y2 = 5;
        boolean result = PointEq.eq(x1, y1, x2, y2);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenX17Y15X27Y25ThenTrue() {
        int x1 = 7;
        int y1 = 5;
        int x2 = 7;
        int y2 = 5;
        boolean result = PointEq.eq(x1, y1, x2, y2);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }
}