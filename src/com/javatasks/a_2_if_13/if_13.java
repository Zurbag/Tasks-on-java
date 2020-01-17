package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Даны действительные числа a, b, c. Вычислите корни уравнения
ax2 + bx + c = 0.
*/
public class if_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());



        System.out.println("ax1^2 + bx2 + c = 0");
        double x1;
        double x2;
        double d = Math.pow((b*-1),2)-4*a*c;
        System.out.println(d);
        if (d > 0){
            x1 = -1*b+Math.sqrt(d)/2*a;
            x2 = -1*b-Math.sqrt(d)/2*a;
            System.out.println(x1+" "+x2);
        } else if (d < 0){
            System.out.println("Корней нет");
        }

    }
}
