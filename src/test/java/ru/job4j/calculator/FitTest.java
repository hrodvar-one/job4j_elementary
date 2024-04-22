package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.calculateIdealWeight(in, true);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.calculateIdealWeight(in, false);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenHeightIsZeroThenMaleWeightShouldBeNegative() {
        short in = 0;
        double expected = -115.0;
        double out = Fit.calculateIdealWeight(in, true);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenHeightIsZeroThenFemaleWeightShouldBeNegative() {
        short in = 0;
        double expected = -126.5;
        double out = Fit.calculateIdealWeight(in, false);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenManIsExtremelyTallThenWeightIsHigh() {
        short in = 300;
        double expected = 230.0;
        double out = Fit.calculateIdealWeight(in, true);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanIsExtremelyTallThenWeightIsHigh() {
        short in = 300;
        double expected = 218.5;
        double out = Fit.calculateIdealWeight(in, false);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}