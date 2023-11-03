package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotEndWithPrefixThenFalseTwo() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'s', 'r'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotEndWithPrefixThenFalseThree() {
        char[] word = {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
        char[] post = {'s', 'r', 'q'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isFalse();
    }
}