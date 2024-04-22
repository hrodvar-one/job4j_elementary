package ru.job4j.calculator;

public class Fit {

    public static double calculateIdealWeight(short height, boolean isMale) {
        int baseHeight = isMale ? 100 : 110;
        double idealWeight = (height - baseHeight) * 1.15;
        return idealWeight;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.calculateIdealWeight(height, true);
        System.out.println("Man 187 is " + man);
    }
}
