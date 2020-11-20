package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        assertThat(MultiMax.max(-2, 8, 5), is(8));
    }

    @Test
    public void whenFirstMax() {
        assertThat(MultiMax.max(20, 2, 5), is(20));
    }

    @Test
    public void whenThirdMax() {
        assertThat(MultiMax.max(-220, 240, 465), is(465));
    }
}