package demo3;
// 3、试编程求解：1！+2！-3！+4！+5！-6！+7！+8！-9！+10！+...+20-21！
public class Test {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 2; i < 22; i++) {
            if(i%2==0){
                result += Factorial(i);
            }
            else {
                result -= Factorial(i);
            }
        }
        System.out.println("结果为"+result);
    }
    public static int Factorial(int num){
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result*i;
        }
        return result;
    }
}
