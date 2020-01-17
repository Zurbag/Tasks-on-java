package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Составьте программу, реализирущую эпизод применения компьютера в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег внесенную покупателем; если сдачи не требуется, печатает на экране "спасибо"; если денег внесено больше, то печатается "возьмите сдачу" и указывает сумму сдачи; если денег недостаточно, то печатает об этом сообщение и указывает размер недостающей суммы.
*/
public class if_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int bookCost = 100;
        System.out.println("Стоимость книги " + bookCost + " внесите платеж");
        int submittedByBuyer = Integer.parseInt(reader.readLine());
        if (bookCost < submittedByBuyer){
            System.out.println("Выдайте сдачу " + (submittedByBuyer - bookCost) + " рублей");
        } else if (bookCost == submittedByBuyer){
            System.out.println("Спасибо за покупку");
        } else {
            System.out.println("Внесите еще "+ (bookCost - submittedByBuyer) );
        }
    }
}
