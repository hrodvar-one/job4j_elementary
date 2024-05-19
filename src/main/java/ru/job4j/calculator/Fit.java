package ru.job4j.calculator;

public class Fit {

    private static final double MAN_OFFSET = 100.0;
    private static final double WOMAN_OFFSET = 110.0;
    private static final double COEFFICIENT = 1.15;

    /**
     * Расчет идеального веса для мужчины.
     *
     * @param height рост мужчины в сантиметрах.
     * @return идеальный вес.
     */
    public static double manWeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - MAN_OFFSET) * COEFFICIENT;
    }

    /**
     * Расчет идеального веса для женщины.
     *
     * @param height рост женщины в сантиметрах.
     * @return идеальный вес.
     */
    public static double womanWeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - WOMAN_OFFSET) * COEFFICIENT;
    }

    public static void main(String[] args) {
        int heightMan = 187;
        int heightWoman = 170;
        double manWeight = Fit.manWeight(heightMan);
        System.out.println("Man with height " + heightMan + " has ideal weight: " + manWeight);
        double womanWeight = Fit.womanWeight(heightWoman);
        System.out.println("Woman with height " + heightWoman + " has ideal weight: " + womanWeight);
    }
}