package HomeWork.HwS3_T1;

import java.util.ArrayList;
import java.util.List;

public class HwS3_T1 {
    public static void main(String[] args) {
        List<Product> item = createList();
        System.out.println("searchMaxPrice(item, maxPrice) = " + searchMaxPrice(item));
    }

    /**
     * @param item обрабатываемый массив
     * @return максимальная цена maxPrice
     * @apiNote Поиск наибольшей цены товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
     */
    private static Integer searchMaxPrice(List<Product> item) {
        Integer maxPrice = 0;
        for (int i = 0; i < item.size(); i++) {
            if (item.get(i).getName().contains("высший") && (item.get(i).getVariety().equals("первый") || item.get(i).getVariety().equals("второй"))) {
                if (item.get(i).getPrice() > maxPrice) {
                    maxPrice = item.get(i).getPrice();
                }
            }
        }
        return maxPrice;
    }

    /**
     * @return заполненный массив
     * @apiNote формирование ArrayList
     */
    private static ArrayList<Product> createList() {
        ArrayList<Product> resultList = new ArrayList<>();

        Product item1 = new Product("мука", 80, "первый");
        Product item2 = new Product("маш высший сорт", 70, "первый");
        Product item3 = new Product("макароны высший сорт", 65, "второй");
        Product item4 = new Product("рис", 50, "третий");
        Product item5 = new Product("свинина высший сорт", 60, "третий");
        Product item6 = new Product("рис", 75, "второй");
        resultList.add(item1);
        resultList.add(item2);
        resultList.add(item3);
        resultList.add(item4);
        resultList.add(item5);
        resultList.add(item6);

        return resultList;
    }
}
