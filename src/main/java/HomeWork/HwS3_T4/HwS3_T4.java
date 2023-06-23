package HomeWork.HwS3_T4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HwS3_T4 {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(12);
        numList.add(5);
        numList.add(8);
        numList.add(21);
        numList.add(35);
        numList.add(53);
        numList.add(9);
        numList.add(3);
        System.out.println("min " + numList.stream().min(Comparator.comparing(Integer::valueOf)));
        System.out.println("max " + numList.stream().max(Comparator.comparing(Integer::valueOf)));
        System.out.println("avg " + getAverage(numList));
    }

    private static double getAverage(List<Integer> list) {
        return list.stream().mapToInt(a -> a).average().orElse(0);
    }
}
