package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSumFromThreeToEightThenThirtyThree() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }
}