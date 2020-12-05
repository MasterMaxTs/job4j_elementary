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
    public void whenAre596Then9() {
        int rsl = Max.max(5, 9, 6);
        assertThat(rsl, is(9));
    }

    @Test
    public void whenAre3521Then5() {
        int rsl = Max.max(3, 5, 2, 1);
        assertThat(rsl, is(5));
    }
}