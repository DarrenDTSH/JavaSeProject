package day15_API02Demo.ExceptionModule02;


import java.util.Scanner;

public class ExceptionDemo12 {
    public static void main(String[] args) {
        // 键盘录入学生的姓名和年龄,其中年龄为 18 - 25岁,
// 分支

//        123
        // 超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止。
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入姓名：");
            String name = sc.nextLine();
            System.out.println("请输入年龄：");
            try {
                String age = sc.nextLine();
                int anInt = Integer.parseInt(age);
                student.setAge(anInt);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数！");
                continue;
            }catch (AgeOutOfBoundsException e) {
                System.out.println(e.toString());
                continue;
            }
        }
        System.out.println(student);
    }
}
