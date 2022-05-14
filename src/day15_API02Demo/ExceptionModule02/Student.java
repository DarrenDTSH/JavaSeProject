package day15_API02Demo.ExceptionModule02;

public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        if(18<age&&age<25){
            this.age = age;
        }else{
            throw new AgeOutOfBoundsException("年龄超出了范围！ 18-25");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(18<age&&age<25){
            this.age = age;
        }else{
            throw new AgeOutOfBoundsException("年龄超出了范围！ 18-25");
        }


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
