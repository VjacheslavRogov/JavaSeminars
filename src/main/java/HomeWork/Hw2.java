package HomeWork;

import java.util.Scanner;

public class Hw2 {
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

    private static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}
