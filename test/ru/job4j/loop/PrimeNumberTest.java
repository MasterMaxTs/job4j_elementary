package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class PrimeNumberTest {

    @Test
    public void when5() {
        assertThat(PrimeNumber.calc(5), is(3));
    }

    @Test
    public void when12() {
        assertThat(PrimeNumber.calc(12), is(5));
    }

    @Test
    public void when2() {
        assertThat(PrimeNumber.calc(2), is(1));
    }
}