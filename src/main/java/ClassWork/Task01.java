package ClassWork;


import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("res = " + zadanie1(n));
    }

    /**
     * @param n входящее целочисленное число
     * @return результат выполнения задания
     * @apiNote Заданное целое число возвращает разность между произведением его цифр на сумму его цифр
     */
    private static int zadanie1(int n) { //todo: переименовать метод
        int multi = 1, sum = 0;
        while (n != 0) {
            int m = n % 10;
            multi *= m;
            sum += m;
            n /= 10;
        }
        return multi - sum;
    }

}
