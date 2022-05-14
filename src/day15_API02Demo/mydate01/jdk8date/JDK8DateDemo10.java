package day15_API02Demo.mydate01.jdk8date;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *  计算两个时间的间隔
 */

public class JDK8DateDemo10 {
    public static void main(String[] args) {
        //public static Duration between(开始时间,结束时间)  计算两个“时间"的间隔
        LocalDateTime time1 = LocalDateTime.of(2022, 5, 11, 23, 45, 20);
        LocalDateTime time2 = LocalDateTime.now();
        Duration between = Duration.between(time1, time2);
        System.out.println(between);
        //PT21H57M58S

        //public long toSeconds()	       获得此时间间隔的秒
        long l = between.toSeconds();
        System.out.println(l+"s");
        //public int toMillis()	           获得此时间间隔的毫秒
        long l1 = between.toMillis();
        System.out.println(l1+"毫秒");
        //public int toNanos()             获得此时间间隔的纳秒
        long l2 = between.toNanos();
        System.out.println(l2+"纳秒");
    }
}
