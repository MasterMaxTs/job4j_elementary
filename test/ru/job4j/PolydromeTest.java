package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PolydromeTest {

    @Test
    public void whenTrue() {
        String digit = "123321";
        Polydrome polydrome = new Polydrome();
        boolean rsl = polydrome.isPolydrome(digit);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenFalse() {
        String digit = "123331";
        Polydrome polydrome = new Polydrome();
        boolean rsl = polydrome.isPolydrome(digit);
        assertThat(rsl, is(false));
    }
}