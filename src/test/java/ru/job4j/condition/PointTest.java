package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when62to32then3() {
        double expected = 3;
        int x1 = 6;
        int y1 = 2;
        int x2 = 3;
        int y2 = 2;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when36to21then5dot10() {
        double expected = 5.10;
        int x1 = 3;
        int y1 = 6;
        int x2 = 2;
        int y2 = 1;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when41to76then5dot83() {
        double expected = 5.83;
        int x1 = 4;
        int y1 = 1;
        int x2 = 7;
        int y2 = 6;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}