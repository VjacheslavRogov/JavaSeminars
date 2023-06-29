package classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Item> itemList = createList(n);
        System.out.println("itemList = " + itemList);
        scanner.nextLine();
        String searchName = scanner.nextLine();
        Integer sumVolume = 0;
        List<String> countryList = new ArrayList<>();
        zadanie1(sumVolume, countryList, itemList, searchName);
    }

    /**
     * @param sumVolume
     * @param countryList
     * @param itemList
     * @param searchName
     * @apiNote Найти страны, которые экспортируют данный товар и общий объём его экспорта
     */
    private static void zadanie1(Integer sumVolume, List<String> countryList, List<Item> itemList, String searchName) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(searchName)) {
                sumVolume += itemList.get(i).getVolume();
                countryList.add(itemList.get(i).getCountry());
            }
        }
        System.out.println("countryList = " + countryList);
        System.out.println(sumVolume);
    }

    /**
     * @param n
     * @return
     * @apiNote формирование ArrayList
     */
    private static ArrayList<Item> createList(int n) {
        ArrayList<Item> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Item item1 = new Item("qwe1", "asd1", random.nextInt(100));
            Item item2 = new Item("qwe2", "asd2", random.nextInt(100));
            Item item3 = new Item("qwe3", "asd3", random.nextInt(100));
            Item item4 = new Item("qwe4", "asd4", random.nextInt(100));
            resultList.add(item1);
            resultList.add(item2);
            resultList.add(item3);
            resultList.add(item4);
        }
        return resultList;
    }
}