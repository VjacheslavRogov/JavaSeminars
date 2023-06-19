package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HwS2_T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthArr = sc.nextInt();
        int[] arraySours = createArray(lengthArr, sc);
        int numReplace = sumIndexTwoDigitNum(arraySours);
        System.out.println("replacementArray(numReplace) = " + Arrays.toString(replacementArray(numReplace, arraySours)));
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
     * @param array входной массив
     * @return sum результат вычислений
     * @apiNote находит сумму индексов двузначных элементов массива
     */
    private static int sumIndexTwoDigitNum(int[] array) {
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] < 0) {
//                array[i] *= -1;
//            }
//        }
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > 9 && array[i] < 100 || array[i] < -9 && array[i] > -100) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * @param numReplace число для замены
     * @param arrReplace входной массив
     * @return arrReplace изменённый массив
     * @apiNote меняет отрицательные числа на numReplace
     */
    private static int[] replacementArray(int numReplace, int[] arrReplace) {
        for (int i = 0; i < arrReplace.length; i++) {
            if (arrReplace[i] < 0) {
                arrReplace[i] = numReplace;
            }
        }
        return arrReplace;
    }
}
