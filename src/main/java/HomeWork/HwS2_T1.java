package HomeWork;

import java.util.Scanner;

public class HwS2_T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sumPrimeNumbers(n, sc) = " + sumSimple(n, sc));
    }

    /**
     * @param number кол-во чисел
     * @param in     сканер
     * @return сумма простых чисел
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     */
    private static int sumSimple(int number, Scanner in) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int num = in.nextInt();
            if (checkSimple(num)) {
                sum += num;
            }
        }
        return sum;
    }

    /**
     * @param n проверяемое число
     * @return простое число или нет
     * @apiNote проверка на простое число
     */
    public static boolean checkSimple(int n) {
        if (n <= 1)
            return false;
        else if (n <= 3)
            return true;
        else if (n % 2 == 0 || n % 3 == 0)
            return false;
        int num = 5;
        while (num * num <= n) {
            if (n % num == 0 || n % (num + 2) == 0)
                return false;
            num = num + 6;
        }
        return true;
    }
}
