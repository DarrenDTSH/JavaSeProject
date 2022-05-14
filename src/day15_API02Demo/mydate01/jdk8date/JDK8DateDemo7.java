package day15_API02Demo.mydate01.jdk8date;

import java.time.LocalDateTime;

/**
 * JDK8 时间类减少或者添加时间的方法
 */
public class JDK8DateDemo7 {
    public static void main(String[] args) {
        //public LocalDateTime minusYears (long years)  减去或者添加年
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 13, 14, 15);
        //LocalDateTime newLocalDateTime = localDateTime.minusYears(1);
        //System.out.println(newLocalDateTime);

        LocalDateTime newLocalDateTime = localDateTime.minusYears(-1);
        System.out.println(newLocalDateTime);
        LocalDateTime localDateTime1 = newLocalDateTime.minusYears(2);
        System.out.println(localDateTime1);

    }
}
