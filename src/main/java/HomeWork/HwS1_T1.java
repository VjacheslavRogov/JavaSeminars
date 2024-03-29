package HomeWork;

import java.util.Scanner;

public class HwS1_T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }

    /**
     * @param s исходная строка
     * @return Возвращает строку слов в обратном порядке, объединенных одним пробелом.
     * @apiNote Reverse Words in a String
     */
    public static String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        String out = "";
        for (int i = str.length - 1; i > 0; i--) {
            out += str[i] + " ";
        }
        return out + str[0];
    }
}
