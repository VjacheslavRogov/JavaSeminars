package ClassWork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Дана строка. Поменять местами её половины.
        Scanner sc = new Scanner(System.in);
        String stringNew = sc.nextLine();
        String subStr1 = stringNew.substring(0, stringNew.length()/2);
        String subStr2 = stringNew.substring(stringNew.length()/2);
        String res = subStr2+subStr1;
        System.out.println(res);
    }
}
