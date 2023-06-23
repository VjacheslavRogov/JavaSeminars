package HomeWork.HwS3_T3;

import HomeWork.HwS3_T2.Product2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HwS3_T3 {
    //Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
    // Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
    public static void main(String[] args) {
        List<Books> books = createList();
        searchBooks(books);
    }

    /**
     * @apiNote Поиск названий книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
     * @param books обрабатываемый массив
     */
    private static void searchBooks(List<Books> books) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (checkSimple(books.get(i).getPageCount())){
                if (books.get(i).getSurname().toLowerCase().contains("а")){
                    if (books.get(i).getYear() >= 2010){
                        names.add(books.get(i).getName());
                    }
                }
            }
        }
        System.out.println("names = " + names);
    }

    /**
     * @param n проверяемое число
     * @return простое число или нет
     * @apiNote проверка на простое число
     */
    public static boolean checkSimple(int n) {
        if (n <= 1)
            return false;
        else if (n <= 3)
            return true;
        else if (n % 2 == 0 || n % 3 == 0)
            return false;
        int num = 5;
        while (num * num <= n) {
            if (n % num == 0 || n % (num + 2) == 0)
                return false;
            num = num + 6;
        }
        return true;
    }

    /**
     * @return заполненный массив
     * @apiNote формирование ArrayList
     */
    private static ArrayList<Books> createList() {
        ArrayList<Books> resultList = new ArrayList<>();

        Books item1 = new Books("Крутой маршрут", "Аинзбург", 1920, 2020, 991);
        Books item2 = new Books("Зелёная миля", "Кинг", 681, 2021, 389);
        Books item3 = new Books("Шерлок Холмс", "Конан Дойл", 488, 1966, 283);
        Books item4 = new Books("Свита короля", "Сакавич", 867, 2010, 167);
        Books item5 = new Books("Возвращение государя", "Толкиен", 380, 2023, 352);
        Books item6 = new Books("Граф Монте-Кристо", "Дюма", 478, 2009, 1088);
        resultList.add(item1);
        resultList.add(item2);
        resultList.add(item3);
        resultList.add(item4);
        resultList.add(item5);
        resultList.add(item6);

        return resultList;
    }
}
