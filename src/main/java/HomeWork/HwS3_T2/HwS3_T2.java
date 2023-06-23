package HomeWork.HwS3_T2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HwS3_T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String variety = sc.nextLine();
        List<Product2> item = createList();
        Integer minPrice = searchMinPrice(item, variety);
        namesProductMinPrice(minPrice, item);
    }

    /**
     * @param minPrice минимальная цена
     * @param item     обрабатываемый массив
     * @apiNote вносит в коллекцию наименования товаров заданного сорта с наименьшей ценой
     */
    private static void namesProductMinPrice(Integer minPrice, List<Product2> item) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < item.size(); i++) {
            if (item.get(i).getPrice() == minPrice) {
                names.add(item.get(i).getName());
            }
        }
        System.out.println("minPrice = " + minPrice);
        System.out.println("names = " + names);
    }

    /**
     * @param item обрабатываемый массив
     * @param var  заданный сорт
     * @return минимальная цена result
     * @apiNote Поиск наименьшей цены товаров заданного сорта
     */
    private static Integer searchMinPrice(List<Product2> item, String var) {
        Integer result = item.get(0).getPrice();
        for (int i = 1; i < item.size(); i++) {
            if (item.get(i).getVariety().equals(var)) {
                if (item.get(i).getPrice() < result) {
                    result = item.get(i).getPrice();
                }
            }
        }
        return result;
    }

    /**
     * @return заполненный массив
     * @apiNote формирование ArrayList
     */
    private static ArrayList<Product2> createList() {
        ArrayList<Product2> resultList = new ArrayList<>();

        Product2 item1 = new Product2("мука", "германия", 5, 80, "первый");
        Product2 item2 = new Product2("маш высший сорт", "россия", 1, 70, "первый");
        Product2 item3 = new Product2("макароны высший сорт", "франция", 2, 65, "второй");
        Product2 item4 = new Product2("рис", "япония", 2, 50, "третий");
        Product2 item5 = new Product2("свинина высший сорт", "польша", 3, 50, "третий");
        Product2 item6 = new Product2("виноград", "испания", 2, 75, "второй");
        resultList.add(item1);
        resultList.add(item2);
        resultList.add(item3);
        resultList.add(item4);
        resultList.add(item5);
        resultList.add(item6);

        return resultList;
    }
}
