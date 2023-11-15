package DZstrings;

public class Task3 {
    public static void main(String[] args) {
        String string = "#javaforever \n" +
                "Изучая эту Джаву,\n" +
                "Cтал похож на Окуджаву:\n" +
                "Облысел, усы да уши...\n" +
                "Но пою чуток похуже!\n" +
                "#javaforever";
        System.out.println(string);
        int lastInd = string.lastIndexOf("#javaforever");
        System.out.println("Индекс последнего появления #javaforever " + lastInd);
    }

}
