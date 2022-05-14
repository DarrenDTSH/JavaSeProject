package day15_API02Demo.mydate01.jdk8date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDK8DateDemo2 {
    public static void main(String[] args) {
        LocalDateTime nowDay = LocalDateTime.now();
        System.out.println(nowDay);
        System.out.println("---------------");
        LocalDateTime dayOf = LocalDateTime.of(1997, 8, 15, 3, 15, 52);
        System.out.println(dayOf);
    }
}
