package classwork;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNumbers(n, sc));
    }

    /**
     * @param number кол-во чисел
     * @param in     сканер
     * @return sum результат вычислений
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     */
    private static int sumNumbers(int number, Scanner in) {
        int sum = 0;
        int firstNum = in.nextInt();
        for (int i = 0; i < number - 1; i++) {
            int num = in.nextInt();
            if (firstNum % 2 == 0 && num % 10 == 5) {
                sum += num;
            }
            firstNum = num;
        }
        return sum;
    }


}
