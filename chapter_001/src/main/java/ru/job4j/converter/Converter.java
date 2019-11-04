package ru.job4j.converter;

public class Converter {
    public static int convertRE(int value) {
        return value / 70;
    }

    public static int convertRD(int value) {
        return value / 60;
    }

    public static int convertDR(int value) {
        return value * 60;
    }

    public static int convertER(int value) {
        return value * 70;
    }

    public static void main(String[] args) {
        int euro = convertRE(140);
        int dollar = convertRD(140);
        int rubleFromDollar = convertDR(dollar);
        int rubleFromEuro = convertER(euro);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are " + dollar + " dollar");
        System.out.println(euro + " euro, this are " + rubleFromEuro + " rubles.");
        System.out.println(dollar + " dollars, this are " + rubleFromDollar + " rubles.");
        int inR = 140;
        int inE = 2;
        int inD = 2;
        int expectedRtoE = 2;
        int expectedRtoD = 2;
        int expectedEtoR = 140;
        int expectedDtoR = 120;
        int outRtoE = convertRE(inR);
        int outRtoD = convertRD(inR);
        int outEtoR = convertER(inE);
        int outDtoR = convertDR(inD);
        boolean passedRtoE = expectedRtoE == outRtoE;
        boolean passedRtoD = expectedRtoD == outRtoD;
        boolean passedEtoR = expectedEtoR == outEtoR;
        boolean passedDtoR = expectedDtoR == outDtoR;
        System.out.println("Tests:");
        System.out.println(inR + " rubles are 2 euro. Test result : " + passedRtoE);
        System.out.println(inR + " rubles are 2 dollars. Test result : " + passedRtoD);
        System.out.println(inE + " euro are 140 rubles. Test result : " + passedEtoR);
        System.out.println(inD + " dollars are 120 rubles. Test result : " + passedDtoR);
    }
}
