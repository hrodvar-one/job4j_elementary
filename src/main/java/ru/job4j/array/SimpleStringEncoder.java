package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";

        int counter;

        for (int i = 0; i < input.length(); i++) {
            counter = 1;
            while (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                counter++;
                i++;
            }

            if (counter == 1) {
                result += input.charAt(i);
            } else {
                result += input.charAt(i) + String.valueOf(counter);
            }
        }
        return result;
    }
}
