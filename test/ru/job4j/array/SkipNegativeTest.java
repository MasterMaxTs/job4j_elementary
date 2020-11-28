package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] input = {
                {1, -1, 4, 9},
                {2, 9, -8, 7}
        };
        int[][] expect = {
                {1, 0, 4, 9},
                {2, 9, 0, 7}
        };
        assertThat(SkipNegative.skip(input), is(expect));
    }
}