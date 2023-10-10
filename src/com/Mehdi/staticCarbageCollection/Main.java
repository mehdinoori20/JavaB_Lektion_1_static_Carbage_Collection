package com.Mehdi.staticCarbageCollection;

public class Main {
    public static void main(String[] args) {
        Counter counterC = new Counter();
      /*
        Counter counterD = new Counter();

        //  Garbage counterA = new counter();
        // Garbage counterB = new counter();
        new Counter();
        counterC = null;
        counterC = counterD;
        System.out.println(counterC); // some memory adress
        System.out.println(counterD); //
        System.gc();

       */

        for (int i = 0; i < 5; i++) {
            System.out.println("--Counter A--");
            Counter.count();

            System.out.println("--Counter B--");
            Counter.count();
        }

    }
}
