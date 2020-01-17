package com.javatasks.a_4_ts_17;
/*
напишите программу, которая требует у вас
пароль, например 111, и если пароль правильный, то заполняет все строки экрана сообщением "Молодец!!!". Если после 5
попытки пароль все равно не верен, выйти из программы.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ts_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int password = 111;
        int coutn = 0;
        while (true){
            System.out.print("Введите пароль: ");
            int inputPassword = Integer.parseInt(reader.readLine());
            if (inputPassword == password) {

                while (true){
                    System.out.println("Молодец!!!");
                }

            }
            coutn++;
            if (coutn == 5){
                return;
            }
        }
    }
}
