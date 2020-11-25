package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSwap2To3() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {1, 2, 4, 3};
        int[] rsl = SwitchArray.swap(input, 2, 3);
        assertThat(rsl, is(expected));
    }
}