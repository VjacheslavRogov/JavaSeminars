package HomeWork.HwS3_T1;

import classwork.Item;
import classwork.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HwS3_T1 {
    //Дан массив записей: наименование товара, цена, сорт.
    // Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
    public static void main(String[] args) {
        List<ItemS3T1> item = createList();
        System.out.println("searchMaxPrice(item, maxPrice) = " + searchMaxPrice(item));
    }

    /**
     * @apiNote Поиск наибольшей цены товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
     * @param item обрабатываемый массив
     * @return максимальная цена maxPrice
     */
    private static Integer searchMaxPrice(List<ItemS3T1> item) {
        Integer maxPrice = 0;
        for (int i = 0; i < item.size(); i++) {
            if (item.get(i).getName().contains("высший") && (item.get(i).getVariety().equals("первый") || item.get(i).getVariety().equals("второй"))) {
                if (item.get(i).getPrice() > maxPrice){
                    maxPrice = item.get(i).getPrice();
                }
            }
        }
        return maxPrice;
    }

    /**
     * @apiNote формирование ArrayList
     * @return заполненный массив
     */
    private static ArrayList<ItemS3T1> createList() {
        ArrayList<ItemS3T1> resultList = new ArrayList<>();

            ItemS3T1 item1 = new ItemS3T1("мука", 80, "первый");
            ItemS3T1 item2 = new ItemS3T1("маш высший сорт", 70, "первый");
            ItemS3T1 item3 = new ItemS3T1("макароны высший сорт", 65, "второй");
            ItemS3T1 item4 = new ItemS3T1("рис", 50, "третий");
            ItemS3T1 item5 = new ItemS3T1("свинина высший сорт", 60, "третий");
            ItemS3T1 item6 = new ItemS3T1("рис", 75, "второй");
            resultList.add(item1);
            resultList.add(item2);
            resultList.add(item3);
            resultList.add(item4);
            resultList.add(item5);
            resultList.add(item6);

        return resultList;
    }
}
