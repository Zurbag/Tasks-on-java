package com.javatasks.a_8_str24;
/*
Дан текст, среди которого есть двоеточие. Получить все символы,
расположенные между первым и вторым двоеточием.
Если второго двоеточия нет, то получить все символы, расположенные после единственного двоеточия. */
public class Str_11 {
    public static void main(String[] args) {
        String str = "Hello: my name is Borrys: Borrys Reaser";
        String [] strSplit = str.split("");
        for (int i = 0; i < str.length(); i++) {
            if (strSplit[i].equals(":")){
                int x = i+1;
                while (true && x<str.length()){
                    if (strSplit[x].equals(":")){
                        return;
                    }
                    System.out.print(strSplit[x]);
                    x++;

                }
            }
        }
    }
}
