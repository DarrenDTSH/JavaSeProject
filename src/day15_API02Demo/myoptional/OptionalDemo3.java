package day15_API02Demo.myoptional;

import java.util.Optional;

public class OptionalDemo3 {
    public static void main(String[] args) {
        //method1();

        //method2();
        //method3();
        //method4();

    }

    private static void method4() {
        //Student s = new Student("zhangsan",23);
        Student s = null;
        Optional<Student> optional = Optional.ofNullable(s);
        //public void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)、
        //如果不为空，则使用该值执行给定的操作，否则执行给定的基于空的操作。
        optional.ifPresentOrElse(student -> System.out.println(student),
                ()->System.out.println("为空了"));
    }

    private static void method3() {
        //Student s = new Student("zhangsan",23);
        Student s = null;
        Optional<Student> optional = Optional.ofNullable(s);
        //ifPresent (Consumer<? super T> action)
        //如果不为空，则使用该值执行给定的操作，否则不执行任何操作
        optional.ifPresent(student -> System.out.println(student));
    }

    private static void method2() {
        Student s = new Student("zhangsan",23);
        //Student s = null;
        Optional<Student> optional = Optional.ofNullable(s);
        //orElseGet(Supplier<? extends T> supplier)
        //如果不为空，则返回具体的值，否则返回由括号中函数产生的结果

        Student student = optional.orElseGet(()-> new Student("lisi" , 24));
        System.out.println(student);
    }

    private static void method1() {
        //Student s = new Student("zhangsan",23);
        Student s = null;
        Optional<Student> optional = Optional.ofNullable(s);
        //orElse(T other) 如果不为空，则返回具体的值，否则返回参数中的值
        Student student = optional.orElse(new Student("lisi", 24));
        System.out.println(student);
    }
}
