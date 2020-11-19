package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax9To6Then9() {
        int rsl = Max.max(9, 6);
        assertThat(rsl, is(9));
    }

    @Test
    public void whenMaxMin2To3Then3() {
        int rsl = Max.max(-2, 3);
        assertThat(rsl, is(3));
    }

    @Test
    public void whenMax5To5Then5() {
        int rsl = Max.max(5, 5);
        assertThat(rsl, is(5));
    }
}