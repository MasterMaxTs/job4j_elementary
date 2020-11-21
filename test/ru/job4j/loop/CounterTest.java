package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void whenFrom10To20sum165() {
        assertThat(Counter.sum(10, 20), is(165));
    }

    @Test
    public void whenFromMin1To6sum20() {
        assertThat(Counter.sum(-1, 6), is(20));
    }
}