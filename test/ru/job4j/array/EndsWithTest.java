package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThanTrue() {
        char[] input = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'o'};
        boolean result = EndsWith.endsWith(input, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenEndWithNoPrefixThanFalse() {
        char[] input = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'k', 'o'};
        boolean result = EndsWith.endsWith(input, post);
        assertThat(result, is(false));
    }
}