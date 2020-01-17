package com.javatasks.a_4_ts_17;

/*Из чисел от 10 до 99 вывести те, сумма цифр которых равна n,
где 0 < 𝑛 <= 18.*/

public class ts_4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            sum = (i%10)+(i/10);
            if (sum > 0 || sum <= 18){
                System.out.println(i+ " "+sum);
            }
        }
    }
}
