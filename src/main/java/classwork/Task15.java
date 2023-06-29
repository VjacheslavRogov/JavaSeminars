package classwork;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        //Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
        LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(1, -2, -1, 5, 9, -10));
        Scanner sc = new Scanner(System.in);
        twoDeleteNegativeNumber(myList);
        System.out.println("myList = " + myList);
    }

    private static void twoDeleteNegativeNumber(LinkedList<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i) < 0){
                myList.remove(i);
                i--;
            }
        }
    }
}
