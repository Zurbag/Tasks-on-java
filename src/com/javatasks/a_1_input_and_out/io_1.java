package com.javatasks.a_1_input_and_out;

/* Написать программу, которая со мною поздоровается.
Пусть она спросит меня мое имя и сколько мне лет. И если я отвечу,
что меня зовут, например, Алеша и мне 13 лет, то пусть поприветствует
меня следующим образом: "Привет, Алеша!", а потом напечатает фразу "Теперь я знаю, что тебе 13 лет.".
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class io_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Как вас зовут?");
        String name = reader.readLine();
        System.out.println("Сколько вам лет?");
        String age = reader.readLine();
        System.out.println("Привет, "+name);
        System.out.println("Теперь я знаю, что тебе " +age+ " лет.");
    }
}
