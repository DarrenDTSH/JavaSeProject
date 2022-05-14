package day15_API02Demo.mydate01.jdk8date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JDK8DateDemo4 {
    public static void main(String[] args) {
        LocalDateTime nowday = LocalDateTime.now();
        //public LocalDate toLocalDate ()    转换成为一个LocalDate对象
        LocalDate localDate = nowday.toLocalDate();
        System.out.println(localDate);
        //public LocalTime toLocalTime ()    转换成为一个LocalTime对象
        LocalTime localTime = nowday.toLocalTime();
        System.out.println(localTime);
    }
}
