package com.javatasks.a_6_pf_13;

/*
Вывести на экран таблицу умножения от 2 до 9.

 */
public class pf_5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            Multiple(i);
            System.out.println(" ");
        }

    }
    public static void Multiple(int a){
        for (int i = 1; i <= 9; i++) {
            System.out.print((a*i)+" ");
        }
    }
}
