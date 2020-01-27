package com.javatasks.a_6_pf_13;
/*Даны два натуральных числа. Определить, является ли первое перевертышем второго.


 */
public class pf_10 {
    public static void main(String[] args) {
        int a = 103;
        int b = 301;
        System.out.println(inverted(a,b));

    }

    public static boolean inverted(int num1, int num2){

       int a = num1/100;
       int b = num1/10%10;
       int c = num1%10%10;
       int invertNum1 = c*100+b*10+a;
       if (invertNum1 == num2){
           return true;
       } else {
           return false;
       }
    }
}
