package HomeWork;

import java.util.Scanner;

public class HwS2_T2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthArr = sc.nextInt();
        int[] array = createArray(lengthArr, sc);
        System.out.println("increasing(array) = " + increasing(array));
    }

    /**
     * @param length длинна массива
     * @param in     сканер
     * @return заполненный массив
     * @apiNote создаёт и заполняет массив
     */
    public static int[] createArray(int length, Scanner in) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    /**
     * @param arrNum проверяемый массив
     * @return возрастающая последовательность или нет в виде строки
     * @apiNote Дана последовательность N целых чисел. Верно ли, что последовательность является возрастающей.
     */
    private static String increasing(int[] arrNum) {
        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i - 1] > arrNum[i]) {
                return "Не возрастающий";
            }
        }
        return "Возрастающий";
    }

}
