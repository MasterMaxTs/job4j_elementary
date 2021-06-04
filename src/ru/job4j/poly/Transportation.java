package ru.job4j.poly;

public class Transportation {
    public static void main(String[] args) {
        Vehicle airplane1  = new Airplane("Boeng737_800", 226);
        Vehicle airplane2 = new Airplane("AirBusA320", 215);
        Vehicle autoBus1 = new AutoBus("Ekarus", 80);
        Vehicle autoBus2  = new AutoBus("Volvo", 110);
        Vehicle train1  = new Train("Sapsan", 1023);
        Vehicle train2  = new Train("Tep70", 12);
        Vehicle[] vehicles = {airplane1, airplane2, autoBus1, autoBus2, train1, train2};
        for(Vehicle tran : vehicles) {
            tran.move();
            System.out.println("Accommodation " + "\"" + tran.getInfo() +"\"" + " is " + tran.accommodate());
        }
    }
}
