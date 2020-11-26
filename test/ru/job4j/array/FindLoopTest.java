package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas7Than1() {
        int[] array = new int[] {3, 7, 5, 12, -8, 9};
        int el = 7;
        int result = FindLoop.indexOf(array, el);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHasMin8Than4() {
        int[] array = new int[] {3, 7, 5, 12, -8, 9};
        int el = -8;
        int result = FindLoop.indexOf(array, el);
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void weFind5() {
        int[] array = new int[] {3, 7, 5, 12, -8, 7, 9};
        int el = 7;
        int start = 4;
        int finish = 8;                                            // finish > array.length
        int result = FindLoop.indexOf(array, el, start, finish);
        int expected = 5;
        assertThat(result, is(expected));
    }

    @Test
    public void weFind1() {
        int[] array = new int[] {3, 7, 5, 12, -8, 7, 9};
        int el = 7;
        int start = 0;
        int finish = 5;
        int result = FindLoop.indexOf(array, el, start, finish);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void weNotFind() {
        int[] array = new int[] {3, 7, 5, 12};
        int el = 7;
        int start = 4;                                            // start > array.length
        int finish = 6;
        int result = FindLoop.indexOf(array, el, start, finish);
        int expected = -1;
        assertThat(result, is(expected));
    }
}