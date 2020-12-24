package demo4;
//试编程实现所附图案的输出。
public class Test {
    public static void main(String[] args) {
        graphical_one();
        graphical_two();
        graphical_three();
    }
    public static void graphical_one(){
        int numbers = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numbers; j++) {
                System.out.print("* ");
            }
            System.out.println();
            numbers--;
        }
        numbers = 2;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < (5-numbers); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numbers; j++) {
                System.out.print("* ");
            }
            System.out.println();
            numbers++;
        }

    }
    public static void graphical_two(){
        int number = 4;
        int num = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(" ");
            }
            number--;
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            for (int j = 0;  j<5 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
            num++;
        }
    }
    public static void graphical_three(){
        int num = 1;
        int space = 10;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int j = 0; j < num; j++) {
                System.out.print("- ");
            }
            System.out.println();
            num++;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            num++;
            System.out.println();
        }
    }
}
