package DZstrings;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "Ругательство";
        char [] array = str1.toCharArray();
        char y = '*';

        for (int i = 1; i < array.length-1; i++) {
           array[i] = y;
                    }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            }

    }
}
