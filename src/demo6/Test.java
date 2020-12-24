package demo6;
//求1000以内的“相亲数”。所谓相亲数是指这样一对数：甲数的约数之和等于乙数，反之亦然。
public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <1000 ; i++) {
            for (int j = 1; j <1000 ; j++) {
                if ((sumDivisor(i)==j)&&(j!=(i+1))){
                    System.out.println(i+"和"+j+"是一对相亲数");
                }
            }
        }
    }
    public static int sumDivisor(int n){
        int result = 0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0) {
                result += i;
            }
        }
        return result;
    }
}
