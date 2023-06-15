package ClassWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multi = 1, sum = 0;
        while (n!=0){
            multi*=n%10;
            sum+=n%10;
            n/=10;
        }
        System.out.println("res = " + (multi-sum));
    }
}
