package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            Product temp = products[i];
            products[i] = products[i + 1];
            products[i + 1] = temp;
        }
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        leftShift(products, 1);
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null) {
                System.out.println("#" + i + " " + products[i].getName()
                        + " - " + products[i].getCount());
            } else {
                System.out.println("#" + i + " " + "null");
            }
        }
    }
}
