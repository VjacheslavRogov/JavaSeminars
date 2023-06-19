package HomeWork;

import java.util.Scanner;

public class HwS1_T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num1 = sc.nextInt();

        while (n > 1){
            int num = sc.nextInt();
            if (isNumberPositive(num1, num)){
                sum += num1;
            }
            num1 = num;
            n--;
        }

        System.out.println(sum);
    }

    /**
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
     * @param a Предыдущее число.
     * @param b Следующее число.
     * @return Сумма положительных чисел после которых идёт отрицательное число.
     */
    private static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}
