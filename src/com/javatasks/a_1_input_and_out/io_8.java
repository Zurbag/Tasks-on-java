package com.javatasks.a_1_input_and_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Четыре человека пообедали в ресторане. Официант подал им счет на x рублей каждому.
Они решают оставить официанту чаевые в размере 15% от счета. Составьте программу,
которая выведет на экран сумму чаевых, которую получил официант.
*/
public class io_8 {
    public static void main(String[] args) throws IOException {
//        double a = 20*0.15;
//        double b = 10*0.15;
//        double c = 5*0.15;
//        double x = 30*0.15;
        // 9.75
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сумма счета для каждого гостя");
        System.out.print("Первый гость = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Второй гость = ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Третий гость = ");
        int c = Integer.parseInt(reader.readLine());
        System.out.print("Четвертый гость = ");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Чаевые 15%");
        double tip = 0.15;
        System.out.println((a+b+c+x)*tip);

    }
}
