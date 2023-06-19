package classwork;

public class Task05 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println("palindrom(myArray) = " + palindrom(myArray));
    }

    /**
     * @param array входной массив
     * @return симметричный или нет в виде строки
     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.Дан массив целых чисел. Верно ли, что массив является симметричным.
     */
    private static String palindrom(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return "Не симметричный!";
            }
        }
        return "Симметричный!";
    }
}
