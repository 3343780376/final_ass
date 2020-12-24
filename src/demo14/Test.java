package demo14;

import java.util.Scanner;
//过编程计算任意项数的Fibonacci序列之和。（所谓Fibonacci序列，系指该序列的首项和第二项的值均为1；
// 从第三项开始，每一项的值均为前两项的值之和）另：所谓Fibonacci序列，系指该序列的首项和第二项的值
// 均为1；从第三项开始，每一项的值均为前两项的值之和。试编程求解前30项Fibonacci序列中带3或3的倍数
// 的相关项之和（即第3项+第6项+第9项+第12项+第13项+…+第27项）。
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入：");
        int n = input.nextInt();
        System.out.println(sumFibonacci(n));
        System.out.println(sumFibonacciSpecial(n));

    }
    public static int sumFibonacci(int n){
        if (n <=2) {
            System.out.println("输入错误");
            return 0;
        }
        else {
            int result = 2;
            int[] a = new int[n];
            a[0] = 1;
            a[1] = 1;
            for (int i = 2; i < a.length; i++) {
                a[i] = a[i-1] + a[i-2];
                result += a[i];
            }
            return result;
        }
    }
    public static int sumFibonacciSpecial(int n){
        int[] a = new int[n];
        if (n <=2) {
            System.out.println("输入错误");
            return 0;
        }
        else {
            a[0] = 1;
            a[1] = 1;
            for (int i = 2; i < a.length; i++) {
                a[i] = a[i-1] + a[i-2];
            }
        }
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if((i%3)==2){
                result += a[i];
            }
            else continue;
        }
        return result;
    }
}
