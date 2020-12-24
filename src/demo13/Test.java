package demo13;

import java.util.Random;
//利用数组和Math类产生十个随机数（范围在127－521之间），并利用不同的排序方法将此数组按升序或降
// 序重新排列，并予输出。
public class Test {
    public static void main(String[] args) {
        for (int i:sort(creatArray())
             ) {
            System.out.println(i);
        }
    }
    public static int[] creatArray(){
        Random random =   new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(394)+127;
        }
        return a;
    }
    public static int[] sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j <a.length; j++) {
                if (a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
