package com.javatasks.a_3_case;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Написать программу, которая по заданной букве русского алфавита определяет, гласная ли это буква*/
public class с_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word =reader.readLine();
        switch (word){
            case ("а"):
                System.out.println("введена гласная буква");
                break;
            case ("е"):
                System.out.println("введена гласная буква");
                break;
            case ("ё"):
                System.out.println("введена гласная буква");
                break;
            case ("и"):
                System.out.println("введена гласная буква");
                break;
            case ("о"):
                System.out.println("введена гласная буква");
                break;
            case ("У"):
                System.out.println("введена гласная буква");
                break;
            case ("э"):
                System.out.println("введена гласная буква");
                break;
            case ("ю"):
                System.out.println("введена гласная буква");
                break;
            case ("я"):
                System.out.println("введена гласная буква");
                break;
            default:
                System.out.println("введена гласная буква");
        }
    }
}
