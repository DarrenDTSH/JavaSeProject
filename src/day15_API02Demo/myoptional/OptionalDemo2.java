package day15_API02Demo.myoptional;

import java.util.Optional;

public class OptionalDemo2 {
    public static void main(String[] args) {
        //get() 如果存在值，返回值，否则抛出NoSuchElementException
        //public boolean isPresent()    判断Optional所封装的对象是否不为空，如果不为空返回true , 否则返回false

        //Student s = new Student("zhangsan",23);
        Student s = null;
        Optional<Student> optional = Optional.ofNullable(s);
        //如果封装的是一个null，那么通过get方法再次获取会抛出NoSuchElementException。
        if(optional.isPresent()){
            Student student = optional.get();
            System.out.println(student);
        }else{
            System.out.println("Optional封装的对象为空");
        }
    }
}
