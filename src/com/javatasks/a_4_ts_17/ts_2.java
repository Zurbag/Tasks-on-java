package com.javatasks.a_4_ts_17;
/*Составить программу вычисления куба суммы всех четных чисел от 2 до 100.*/
public class ts_2 {
    public static void main(String[] args) {
        int summ = 0;
        for (int i = 2; i <=100 ; i++) {
            if (i%2 == 0){
                summ = summ+i;
            }
        }
        long pow = (long) Math.pow((double)summ, 3.0);
        System.out.println(pow);
    }
}
