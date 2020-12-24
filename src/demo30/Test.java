package demo30;


//编程实现数据加密（先编写一加密方法，然后在主方法中调用实现）：加密规则为：输入一个五位数整数
// ，每位数字都加上6，然后再用除以8的余数代替该数字，再将第一位和第五位交换，第二位和第四位交
// 换；最后，输出并显示加密后的数据。
        //又：如果对任意一个六位整数进行加密处理，规则为每位数加1（如果为9则加1后变成0），
// 然后再16位、25位、34位交换。现在如果给出已加密的数据，试编程实现解密算法（即求出加密前的
// 原始数据）。

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个需要加密的五位数：");
        System.out.println("加密后的数字为"+encryptionFive(input.nextInt()));
        System.out.print("请输入一个需要解密的六位数：");
        System.out.println("解密后的数字为"+encryptionSix(input.nextInt()));
    }

    public static int encryptionSix(int number){
        int[] a = new int[6];
        String num = number+"";
        if (num.length() != 6){
            System.out.println("输入的数不为六位数");
            return 0;
        }
        for (int i = 0; i < 6; i++) {
            a[i] = Integer.parseInt(num.substring(i,i+1));
        }
        int temp;
        temp = a[0];a[0] = a[5];a[5] = temp;
        temp = a[1];a[1] = a[4];a[4] = temp;
        temp = a[2];a[2] = a[3];a[3] = temp;
        for (int i = 0; i < 6; i++) {
            if (a[i]==0)a[i] = 9;
            else {
                a[i] = a[i]-1;
            }
        }
        return Integer.parseInt((a[0]+"")+(a[1]+"")+(a[2]+"")+(a[3]+"")+(a[4]+"")+(a[5]+""));
    }
    public static int encryptionFive(int number){
        String num = number + "";
        if (num.length() != 5){
            System.out.println("输入的数不为整数");
            return 0;
        }
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(num.substring(i,i+1));
            a[i] += 6;
            a[i] = a[i] % 8;
        }

        int temp;
        temp = a[0];a[0] = a[4];a[4] = temp;
        temp = a[1];a[1] = a[3];a[3] = temp;
        return Integer.parseInt((a[0]+"")+(a[1]+"")+(a[2]+"")+(a[3]+"")+(a[4]+""));
    }
}
