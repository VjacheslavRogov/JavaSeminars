package classwork;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //Дана строка. Поменять местами её половины.
        Scanner sc = new Scanner(System.in);
        String stringNew = sc.nextLine();
        System.out.println("zadanie3(sringNew) = " + zadanie3(stringNew));
    }

    /**
     * @param stringNew исходная строка
     * @return результирующая строка
     * @apiNote Дана строка. Поменять местами её половины.
     */
    private static String zadanie3(String stringNew) {
        String subStr1 = stringNew.substring(0, stringNew.length() / 2);
        String subStr2 = stringNew.substring(stringNew.length() / 2);
        return subStr2 + subStr1;
    }
}
