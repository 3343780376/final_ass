package demo9;
//创建一个学生类，包含其学号、姓名及语文（yw）、数学（sx）、外语（wy）三科成绩，
// 并通过构造方法确定该学生的学号和姓名用以创建该学生对象，并包含一个方法：
// 可用于计算该学生的总成绩（三科之和）。
public class Test {
    public static void main(String[] args) {
        Student student = new Student("123","小明",70.0f,63.6f,87.1f);
        System.out.println("总成绩为"+student.getAllGrade());
    }
}
class Student{
    public String id;
    public String name;
    public float yw;
    public float sx;
    public float wy;

    public Student(String id,String name,float yw,float sx,float wy){
        this.id = id;
        this.name = name;
        this.yw = yw;
        this.sx = sx;
        this.wy = wy;
    }
    public float getAllGrade(){
        return this.wy+this.sx+this.yw;
    }
}
