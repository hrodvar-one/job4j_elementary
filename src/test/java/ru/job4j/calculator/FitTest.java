package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FitTest {

    @Test
    public void whenManHeight187ThenWeight100dot05() {
        int height = 187;
        double expected = 100.05;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenWomanHeight170ThenWeight69dot0() {
        int height = 170;
        double expected = 69.0;
        double result = Fit.womanWeight(height);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenManHeightNegativeThenException() {
        int height = -170;
        assertThatThrownBy(() -> Fit.manWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be positive");
    }

    @Test
    public void whenWomanHeightNegativeThenException() {
        int height = -170;
        assertThatThrownBy(() -> Fit.womanWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be positive");
    }
}