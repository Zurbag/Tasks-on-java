package com.javatasks.a_4_ts_17;
/*Определите номерной знак автомашины
нарушившей правила движения, если по показателям свидетелей номер записывается тремя цифрами, кратен 2, 5 и 7, а сумма его цифр равна 12.*/
public class ts_3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        for (int i = 100; i <= 999 ; i++) {
            if (i%2 == 0  && i%5 == 0 && i%7 == 0){
              c = i%10;
              b = i%100/10;
              a = i/100;
               if (a+b+c == 12){
                   System.out.println(i);
               }
            }
        }
    }
}
