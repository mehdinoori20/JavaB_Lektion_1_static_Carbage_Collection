package com.Mehdi.staticCarbageCollection;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();


        for (int i = 0; i < 5; i++) {
            System.out.println("--Counter A--");
            Counter.count();

            System.out.println("--Counter B--");
            Counter.count();
        }

    }
}
