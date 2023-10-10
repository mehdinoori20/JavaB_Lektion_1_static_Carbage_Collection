package com.Mehdi.staticCarbageCollection;

public class Counter {
    static int value = 0;

    static public void count() {
        System.out.println("Befor " + value);
        value++;
        System.out.println("after " + value);
    }
    /* TODO - About Static!
     *
     *  statics methods , Must have static variables
     * regular methods, Can have static variables
     *
     * What does statics method do?
     *    - Unchanged memory position
     *    - ONE memory position   only
     *    - ONE reference only
     *  
     * */
}
