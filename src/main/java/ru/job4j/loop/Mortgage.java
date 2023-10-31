package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;

        while (amount > 0) {
            double debt = amount + (amount * percent / 100);
            amount = debt - salary;
            year++;
        }
        return year;
    }
}
