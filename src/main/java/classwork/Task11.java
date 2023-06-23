package classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Item item1 = new Item("qwe1", "asd1", 3);
        Item item2 = new Item("qwe2", "asd2", 4);
        Item item3 = new Item("qwe3", "asd3", 5);
        Item item4 = new Item("qwe4", "asd4", 10);
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        System.out.println("itemList = " + itemList);
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        Integer sumVolume = 0;
        List<String> countryList = new ArrayList<>();
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(searchName)) {
                sumVolume += itemList.get(i).getVolume();
                countryList.add(itemList.get(i).getCountry());
            }
        }
        System.out.println("countryList = " + countryList);
        System.out.println(sumVolume);
    }
}