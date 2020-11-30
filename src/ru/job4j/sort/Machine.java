package ru.job4j.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] change = new int[100];                             //default
        int size = 0;
        int rem = money - price;

        for (int i = 0; i < coins.length; i++) {
            while (rem >= coins[i]) {
                int count = rem / coins[i];
                rem %= coins[i];

                for (int j = 0; j < count; j++) {
                   change[size] = coins[i];
                   size++;
                }
            }
        }
        return Arrays.copyOf(change, size);
    }

}
