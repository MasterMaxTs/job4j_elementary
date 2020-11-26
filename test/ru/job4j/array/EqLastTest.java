package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EqLastTest {

    @Test
    public void whenEqLastThenTrue() {
        int[] left = new int[] {1, 5, 4, 3, 9};
        int[] right = new int[] {98, 30, 9};
        assertThat(EqLast.check(left, right), is(true));
    }

    @Test
    public void whenNotEqLastThenFalse() {
        int[] left = new int[] {1, 5, 4, 3, 9};
        int[] right = new int[] {98, 30, 3};
        assertThat(EqLast.check(left, right), is(false));
    }
}