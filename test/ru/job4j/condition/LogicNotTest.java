package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicNotTest {

    @Test
    public void whenNumMin8() {
        assertThat(LogicNot.isEven(-8), is(true));
        assertThat(LogicNot.isPositive(-8), is(false));
        assertThat(LogicNot.notEven(-8), is(false));
        assertThat(LogicNot.notEvenAndPositive(-8), is(false));
        assertThat(LogicNot.evenOrNotPositive(-8), is(true));
    }

}