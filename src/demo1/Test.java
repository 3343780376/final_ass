package demo1;

// 1、求解”鸡兔同笼问题”:鸡和兔在一个笼里，共有腿100条、头40个，问鸡兔各几只。

public class Test {
    public static void main(String[] args) {
        int x=0,y=0; //x为鸡的数量，y为兔的数量
        for (x = 0; x <40 ; x++) {
            for (y = 0; y <25 ; y++) {
                if((2*x+4*y==100)&&(x+y==40)){
                    System.out.println("鸡有"+x+"只，兔有"+y+"只。\n");
                }
            }
        }
    }
}
