package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.length() == 1) {
                result += symbol;
                break;
            }
            if (i < input.length() - 1) {
                if (input.charAt(i) == input.charAt(i + 1)) {
                    counter++;
                } else {
                    if (counter == 1) {
                        result += input.charAt(i) + "";
                    } else {
                        result += input.charAt(i) + "" + counter;
                    }
                    counter = 1;
                }
            } else {
                if (counter == 1) {
                    result += input.charAt(i) + "";
                } else {
                    result += input.charAt(i) + "" + counter;
                }
            }
        }
        return result;
    }
}
