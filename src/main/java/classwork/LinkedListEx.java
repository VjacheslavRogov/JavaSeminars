package classwork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(random.nextInt(10));
        }
        System.out.println("integerLinkedList = " + integerLinkedList);
        sc.close();
        System.out.println("integerLinkedList.peek() = " + integerLinkedList.peek());
        System.out.println("integerLinkedList.pop() = " + integerLinkedList.pop());
        integerLinkedList.addFirst(3);
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.addLast(6);
        System.out.println("integerLinkedList = " + integerLinkedList);
        //integerLinkedList.remove(3);
        //System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.remove((Integer) 3);
        System.out.println("integerLinkedList = " + integerLinkedList);
    }
}
