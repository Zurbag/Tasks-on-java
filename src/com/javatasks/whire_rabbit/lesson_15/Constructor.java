package com.javatasks.whire_rabbit.lesson_15;

public class Constructor {

    public void foo(){
        Flower flower = new Flower();
        flower.name = "Chamomile";
        flower.color = "White";

        Flower flower1 = new Flower("Rose","Red");
        Flower flower2 = new Flower("Tulip","Yellow");



        System.out.println(flower.name + " "+ flower.color);
        System.out.println(flower1.name + " "+ flower1.color);


    }
}
