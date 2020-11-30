package ru.job4j.sort;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MachineTest {

    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expect = {};
        assertThat(machine.change(100, 100), is(expect));

    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expect = {10, 5};
        assertThat(machine.change(50, 35), is(expect));

    }

    @Test
    public void when79by30() {
        Machine machine = new Machine();
        int[] expect = {10, 10, 10, 10, 5, 2, 2};
        assertThat(machine.change(79, 30), is(expect));
    }
}