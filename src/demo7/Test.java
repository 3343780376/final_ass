package demo7;

import java.util.Scanner;

// 7、试编程求任意自然数n以内的全部素数之和。
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int n = input.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (sumPrimeNumber(i)) {
                result += i;
                System.out.println(i);
            }
        }
        System.out.println(result);
    }
    public static boolean sumPrimeNumber(int n){
        int i;
        for (i = 2; i <n; i++) {
            if (n%i==0)break;
        }
        return n==i;
    }
}
