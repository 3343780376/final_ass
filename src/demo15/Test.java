package demo15;

//五张100元的大钞票，换成等值的50元，20元，10元，5元一张的小钞票，要求换成30张小钞票，
// 每种面值的至少一张，编程输出所有可能的换法，程序应适当考虑减少重复次数。
public class Test {
    public static void main(String[] args) {
        //i表示50元的张数，j表示20元的张数，k表示10元的张数,l表示5元一张
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 25; j++) {
                for (int k = 1; k < 50; k++) {
                    for (int l = 1; l < 100; l++) {
                        if((50*i+20*j+10*k+5*l==500)&&(i+j+k+l==30)){
                            System.out.printf("50元的%d张，\n20元的%d张，\n10元的%d张，\n5元的%d张\n",i,j,k,l);
                        }
                    }
                }
            }
        }
    }
}
