package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan200ThenWeight115() {
        short height = 200;
        double expected = 115;
        double rsl = Fit.manWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenWoman170ThenWeight69() {
        short height = 170;
        double expected = 69;
        double rsl = Fit.womanWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}