package demo2;
// 2、求解”百鸡问题”:已知公鸡每只3元，母鸡每只5元；每3只小鸡1元，现需用100元买100只鸡，问每种鸡应各买多少只。
public class Test {
    public static void main(String[] args) {
        int x=0,y=0,z=0;  //公鸡x只，母鸡y只，小鸡3z只
        for (x = 0; x <30 ; x++) {
            for (y = 0; y < 20; y++) {
                for (z = 0; z < 34; z++) {
                    if((3*x+5*y+z==100)&&(x+y+3*z==100)){
                        System.out.println("此时公鸡"+x+"只，母鸡"+y+"只，小鸡"+3*z+"只。");
                    }
                }
            }
        }
    }
}

