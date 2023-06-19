package HomeWork;

import java.util.Scanner;

public class HwS2_T2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("increasing(n, sc) = " + increasing1(n, sc));
    }

    /**
     * @param number кол-во чисел
     * @param in     сканер
     * @return возрастающая последовательность или нет в виде строки
     * @apiNote Дана последовательность N целых чисел. Верно ли, что последовательность является возрастающей.
     */
    private static String increasing1(int number, Scanner in) {
        int firstNum = in.nextInt();
        for (int i = 0; i < number - 1; i++) {
            int num = in.nextInt();
            if (firstNum > num) {
                return "Не возрастающий";
            }
        }
        return "Возрастающий";
    }
}
