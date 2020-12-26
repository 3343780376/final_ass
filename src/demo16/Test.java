package demo16;

import java.util.ArrayList;

//某人有5张3分和4张5分的邮票，请编写一个程序，计算由这些邮票中的1张或若干张可以得到多
// 少种不同的邮资，并按照邮资从小到大顺序显示。
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= 4; j++) {
                int num = 3*i+5*j;
                if (!list.contains(num)){
                    list.add(num);
                }
            }
        }
        Object[] array = list.toArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if ((int)array[i]>(int)array[j]){
                    int temp = (int)array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("邮资可以为：");
        for (Object i:array
             ) {
            System.out.print(i+"  ");
        }
    }
}
