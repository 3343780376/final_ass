package demo10;
//编程实现下列图案的输出。
public class Test {
    public static void main(String[] args) {
        graphical_one();
        System.out.println();
        graphical_two();
        System.out.println();
        graphical_three();
        System.out.println();
        graphical_four();
    }
    public static void graphical_one(){
        int num = 12;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < (12 - num); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 6; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (13 - num); j++) {
                System.out.print("* ");
            }
            System.out.println();
            num--;
        }
    }
    public static void graphical_two() {
        int num = 16;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < (16 - num); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
            num--;
        }
    }
    public static void graphical_three() {
        int num = 16;
        int space = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
            num--;
            space += 2;
        }
    }
    public static void graphical_four(){
        int num = 12;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < (12 - num); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 6; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (13 - num); j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 6; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
            num--;
        }
    }
}
