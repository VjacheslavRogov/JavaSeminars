package ClassWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num1 = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            if (isNumberPositive(num1, num)) {
                count++;
            }
            num1 = num;
        }
        System.out.println("count = " + count);
    }

    /**
     * @param a previous number.
     * @param b next number.
     * @return is previous number less than 0 and number
     * is greater or equal 0
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
     */
    private static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}
