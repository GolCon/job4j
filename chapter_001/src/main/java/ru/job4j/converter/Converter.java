package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value/70;
    }
    public static int rubleToDollar(int value) {
        return value/60;
    }
    public static int dollarToRuble(int value) {
        return value*60;
    }
    public static int euroToRuble(int value) {
        return value*70;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(140);
        int rubleFromDollar = dollarToRuble(dollar);
        int rubleFromEuro = euroToRuble(euro);

        // вывод результата
        System.out.println("140 rubles are "+ euro + " euro");
        System.out.println("140 rubles are "+ dollar +" dollar");
        System.out.println(euro+ " euro, this are "+rubleFromEuro+ " rubles.");
        System.out.println(dollar+" dollars, this are "+ rubleFromDollar+ " rubles.");

        //Тестирование
        int inR=140; //рублей
        int inE=2; //евро
        int inD=2; //долларов, при  float  ошибка
        //эталонный результат
        int expectedRtoE=2; //рубли в евро
        int expectedRtoD=2; //рубли в доллары, пишет ошибку если использовать float
        int expectedEtoR=140; //евро в рубли
        int expectedDtoR=120; // доллары в рубли , потеря 20 копеек при конвертации валюты
        //подстановка, выход.
        int outRtoE=rubleToEuro(inR);
        int outRtoD=rubleToDollar(inR);
        int outEtoR = euroToRuble(inE);
        int outDtoR = dollarToRuble(inD);
        // сравнение
        boolean passedRtoE = expectedRtoE==outRtoE;
        boolean passedRtoD = expectedRtoD==outRtoD;
        boolean passedEtoR = expectedEtoR==outEtoR;
        boolean passedDtoR = expectedDtoR==outDtoR;

        // вывод сравнений
        System.out.println("Tests:");
        System.out.println(inR+" rubles are 2 euro. Test result : "+passedRtoE);
        System.out.println(inR+" rubles are 2 dollars. Test result : "+passedRtoD);
        System.out.println(inE+" euro are 140 rubles. Test result : "+passedEtoR);
        System.out.println(inD+" dollars are 120 rubles. Test result : "+passedDtoR);

    }
}
