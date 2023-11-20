package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int one, int two, int three) {
        return three > max(one, two) ? three : max(one, two);
    }

    public static int max(int one, int two, int three, int four) {
        return four > max(one, two, three) ? four : max(one, two, three);
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число " + Max.max(7, 4));
    }
}
