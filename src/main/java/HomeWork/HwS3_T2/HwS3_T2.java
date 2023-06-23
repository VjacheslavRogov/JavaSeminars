package HomeWork.HwS3_T2;

import HomeWork.HwS3_T1.ItemS3T1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HwS3_T2 {
    // Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
    // Получить наименования товаров заданного сорта с наименьшей ценой.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String variety = sc.nextLine();
        List<ItemS3T2> item = createList();
        System.out.println("searchMinPrice(item, variety) = " + searchMinPrice(item, variety));
    }

    /**
     * @param item обрабатываемый массив
     * @return максимальная цена maxPrice
     * @apiNote Поиск наибольшей цены товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
     */
    private static Integer searchMinPrice(List<ItemS3T2> item, String var) {
        Integer minPrice = item.get(0).getPrice();
        for (int i = 1; i < item.size(); i++) {
            if (item.get(i).getVariety().equals(var)) {
                if (item.get(i).getPrice() < minPrice) {
                    minPrice = item.get(i).getPrice();
                }
            }
        }
        return minPrice;
    }

    /**
     * @return заполненный массив
     * @apiNote формирование ArrayList
     */
    private static ArrayList<ItemS3T2> createList() {
        ArrayList<ItemS3T2> resultList = new ArrayList<>();

        ItemS3T2 item1 = new ItemS3T2("мука", "германия", 5, 80, "первый");
        ItemS3T2 item2 = new ItemS3T2("маш высший сорт", "россия", 1, 70, "первый");
        ItemS3T2 item3 = new ItemS3T2("макароны высший сорт", "франция", 2, 65, "второй");
        ItemS3T2 item4 = new ItemS3T2("рис", "япония", 2, 50, "третий");
        ItemS3T2 item5 = new ItemS3T2("свинина высший сорт", "польша", 3, 60, "третий");
        ItemS3T2 item6 = new ItemS3T2("виноград", "испания", 2, 75, "второй");
        resultList.add(item1);
        resultList.add(item2);
        resultList.add(item3);
        resultList.add(item4);
        resultList.add(item5);
        resultList.add(item6);

        return resultList;
    }
}
