package demo8;

//试求1-100以内的自然数之和。要求这些自然数不包含3及其倍数，且最后的结果值不超过1800。
// （即控制在1800的范围以内，一旦超过，即结束求和运算并输出当前结果）
//再求1-100以内的自然数之和，要求不包含任何带7的数字。
public class Test {
    public static void main(String[] args) {
        funOne();
        funTwo();
    }
    public static void funOne(){
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if ((result+i)>=1800)break;
            if (i%3==0) continue;
            else {
                result += i;
            }
        }
        System.out.println(result);
    }
    public static void funTwo(){
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            if (check(i)){
                continue;
            }
            else {
                result += i;
            }
        }
        System.out.println(result);
    }
    public static boolean check(int n){
        // 包含7返回true
        String s = n+"";
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("7")){
                return true;
            }
        }
        return false;
    }
}


