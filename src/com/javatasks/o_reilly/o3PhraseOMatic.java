package com.javatasks.o_reilly;

public class o3PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-фунтовый",
                "взаимный", "обоюдный выигрыш", "фронтенд",
                "на остнове веб технологий", "проникающий", "умный",
                "шесть-сигм", "метод критического пути", "динамичный",
                "структурированный", "сверхвыгодный", "амбициозный", "всесторонний"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный",
                "центральный", "распределенный", "клатеризированный", "фирменный", "нестандартный ум",
                "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой",
                "выровненный", "нацеленный на", "общий", "совместный", "ускоренный", "классический"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры",
                "талант", "подход", "уровень завоеванного внимания", "портал", "переиод времени", "обзор",
                "образец", "пункт следования"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];

        System.out.println("Все, что нам нужно, - это " +phrase);
    }
}
