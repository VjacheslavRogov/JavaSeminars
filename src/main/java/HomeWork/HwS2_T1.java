package HomeWork;

import java.util.Scanner;

public class HwS2_T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sumPrimeNumbers(n, sc) = " + sumPrimeNumbers(n, sc));
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param number кол-во чисел
     * @param in сканер
     * @return сумма простых чисел
     */
    private static int sumPrimeNumbers(int number, Scanner in) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int num = in.nextInt();
            if (num < 10) {
                sum += num;
            }
        }
        return sum;
    }
}
