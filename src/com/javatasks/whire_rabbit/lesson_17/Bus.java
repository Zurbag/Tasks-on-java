package com.javatasks.whire_rabbit.lesson_17;

public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D23HA";
    public final int SERIAL_NUMBER_2 = 234566;

    public void go(){
        System.out.println("Go");
    }

    public int showKm(){
        int km = 60;
        return km;
    }
}
