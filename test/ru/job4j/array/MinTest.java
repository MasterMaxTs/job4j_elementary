package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinTest {

    @Test
    public void whenFirstMin() {
        assertThat(Min.min(new int[] {2, 7, 4}), is(2));
    }

    @Test
    public void whenLastMin() {
        assertThat(Min.min(new int[] {9, 5, 3}), is(3));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(Min.min(new int[] {7, 5, 9}), is(5));
    }
}