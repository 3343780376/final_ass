package demo28;

import java.util.Map;
import java.util.Scanner;

//任给两个字符串S1和S2，假定S2的长度小于S1，试编程计算并返回S2在S1中出现的次数（未出现返回0）
// 及所在位置序号之总和（因字符串的起始序号为0，故若未出现则返回-1）。如S1＝“ABCDABEFAB”，
// S2＝“AB”，则S2在S1中出现的次数为3；所在位置序号之总和为0＋4＋8＝12。
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入字符串s1:  ");
        String s1 = input.nextLine();
        System.out.print("请输入字符串s2:  ");
        String s2 = input.nextLine();
        int[] a = Make(s1,s2);
        System.out.println("s2在s1中出现了"+a[0]+"次， 出现的位置和为："+ a[1]);
    }

    public static int[] Make(String s1,String s2){
        int[] result = new int[]{-1,0};
        int n = s2.length();
        for (int i = 0; i < s1.length(); i += n) {
            if (s1.substring(i,i+n).equals(s2)){
                result[0] += 1;
                result[1] += i;
            }
        }
        return result;
    }
}
