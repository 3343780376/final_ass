package demo11;
//“歌德巴赫猜想”指出，任何一个大于6的偶数均可表示为两个素数之和，试编程将6－50以内所有
// 偶数都表示成两个素数之和，如6＝1＋5、8＝1＋7等。
public class Test {
    public static void main(String[] args) {
        for (int i = 6; i < 50; i+=2) {
            for (int j = 2; j < i; j++) {
                for (int k = 2; k < i; k++) {
                    if (isPrimeNumber(j)&&isPrimeNumber(k)&&(i==k+j)){
                        System.out.println(i+"="+k+"+"+j);
                    }
                }
            }
        }
    }
    public static boolean isPrimeNumber(int n){
        int i;
        for (i = 2; i <n; i++) {
            if (n%i==0)break;
        }
        return n==i;
    }
}
