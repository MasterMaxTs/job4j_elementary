package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void whenStartsWithPrefixThenTrue() {
        char[] word = new char[] {'W', 'e', 'l', 'c', 'o', 'm'};
        char[] pref = new char[] {'W', 'e'};
        assertThat(ArrayChar.startsWith(word, pref), is(true));
    }

    @Test
    public void whenStartsWithNotPrefixThenFalse() {
        char[] word = new char[] {'W', 'e', 'l', 'c', 'o', 'm'};
        char[] pref = new char[] {'V', 'e'};
        assertThat(ArrayChar.startsWith(word, pref), is(false));
    }

}