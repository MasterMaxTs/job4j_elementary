package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] inputData = new boolean[] {true, true, true};
        boolean rst = Check.mono(inputData);
        assertThat(rst, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] inputData = new boolean[] {true, true, false, true};
        boolean rst = Check.mono(inputData);
        assertThat(rst, is(false));
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] inputData = new boolean[] {false, false, false, false};
        boolean rst = Check.mono(inputData);
        assertThat(rst, is(true));
    }
}