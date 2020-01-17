package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if_7 {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,d;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());

        int result =  a>b?a>c?a>d?a:d:c>d?c:d:b>c?b>d?b:d:c>d?c:d;

        System.out.println(result);
    }
}
