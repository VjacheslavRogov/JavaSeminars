package ClassWork;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrNum = {4, 2, 5, 8, 4, 9, 3, 4, 2};
        System.out.println(countElem(arrNum));
    }

    /**
     * @param arr входной массив
     * @return countN кол-во пар
     * @apiNote Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
     */
    private static int countElem(int[] arr) {
        int countN = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 2 * arr[i]) {
                countN += 1;
            }

        }
        return countN;
    }
}
