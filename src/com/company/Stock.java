package com.company;

public class Stock extends Thread{
    private int stock = 0;

    public void put() {
        if (stock>0){
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stock = stock+5;
        System.out.println("Производитель положил 5 продук ");
        System.out.println("На сколаде " + stock + " продукт");
    }

    public  void get() {
        if (stock < 0) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       stock = stock-5;
        System.out.println("Потребитель взял 5 продук");
        System.out.println("На сколаде " + stock + " продукт");
    }
}
