package com.company;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();

        Manufacturer manufacturer = new Manufacturer(stock);
        Consumer consumer = new Consumer(stock);

        Thread thread1 = new Thread(manufacturer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}
