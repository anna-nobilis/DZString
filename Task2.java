package DZstrings;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name1;
        String name2;
        System.out.println("Введите первое имя");
        name1 = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите второе имя");
        name2 = scanner1.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Вы тёзки");
        }
        else {
            System.out.println("Вы не тезки");
        }
        }
    }



