package ru.job4j.pojo;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ShopTest {

    @Test
    public void whenLastNull() {
        Product[] products = new Product[3];
        products[0] = new Product("Bread", 12);
        products[1] = new Product("Milk", 6);
        int index = Shop.indexOfNull(products);
        assertThat(index, is(2));
    }

    @Test
    public void whenFirstNull() {
        Product[] products = new Product[2];
        products[1] = new Product("Milk", 6);
        int index = Shop.indexOfNull(products);
        assertThat(index, is(0));
    }

    @Test
    public void whenHasNotNull() {
        Product[] products = new Product[2];
        products[0] = new Product("Bread", 12);
        products[1] = new Product("Milk", 6);
        int index = Shop.indexOfNull(products);
        assertThat(index, is(-1));
    }
}