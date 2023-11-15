package DZstrings;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password;
        System.out.println("Введите пароль");
        password = scanner.nextLine();
        boolean onlyLatinAlphabet;
        onlyLatinAlphabet = password.matches("^[a-zA-Z0-9]+$");
        if (onlyLatinAlphabet) {

            char[] d = password.toCharArray();


            for (int i = 0; i < d.length; i++) {
                if (Character.isLetter(d[i])) {
                    int temp = String.valueOf(d[i]).getBytes()[0];
                    System.out.print(temp);
                } else {
                    int temp = Integer.parseInt(String.valueOf(d[i]));
                    ++temp;
                    if(temp == 10){
                        temp = 1;
                        System.out.print(temp);
                    }else {
                        System.out.print(temp);
                    }
                }

            }
        } else {
            System.out.println("Пароль содержит некорректные символы");
        }

    }
}
