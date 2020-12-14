package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ableToDrive() {
        int amountOfFuel = 20;
        boolean serviceability = true;
        if (amountOfFuel > 0 && serviceability) {
            System.out.println("The Bus will go...");
        }
    }

    @Override
    public void capableOfCarrying(int number) {
        int capacity = 60;
        int remains = 47;
        if (remains + number <= capacity) {
            System.out.println("All passengers will take the bus");
        } else {
            System.out.println("The bus is full and won't go anywhere!");
        }


    }

    @Override
    public float fillUp(int amount) {
        float price = 48.65f;
        return price * amount;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.ableToDrive();
        bus.capableOfCarrying(14);
        System.out.println("Price for 90 l. of the fuel: " + bus.fillUp(90) + " rbl");
    }
}
