package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        assertThat(SortSelected.sort(new int[] {2, 7, 5, 9, 1, 2, 1}),
                is(new int[] {1, 1, 2, 2, 5, 7, 9}));
    }
}