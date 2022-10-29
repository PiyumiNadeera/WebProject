package com.company;

public class Counters {
   private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(){
        value++;
        System.out.println(value);
    }
}
