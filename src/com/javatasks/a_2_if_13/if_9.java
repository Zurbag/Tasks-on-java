package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Для 3-x целых чисел a,b,c найти произведение двух наименьших, пользуясь формулой a·b·c / max(a,b,c) .
*/
public class if_9 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        int max = a>b?a>c?a:c:b>c?b:c;
        int result = (a*b*c) / max;
        System.out.println(result);
    }
}
