package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP10k3thenSquare4p68() {
        int p = 10;
        int k = 3;
        double expected = 4.68;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP100k9thenSquare225() {
        int p = 100;
        int k = 9;
        double expected = 225;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}