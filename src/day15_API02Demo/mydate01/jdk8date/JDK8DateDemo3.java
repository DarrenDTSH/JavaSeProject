package day15_API02Demo.mydate01.jdk8date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class JDK8DateDemo3 {
    public static void main(String[] args) {

        LocalDateTime localDay = LocalDateTime.of(1997, 8, 15, 3, 15, 52);
        //        //public int getYear()           获取年
//        int year = localDateTime.getYear();
//        System.out.println("年为" +year);
//        //public int getMonthValue()     获取月份（1-12）
//        int month = localDateTime.getMonthValue();
//        System.out.println("月份为" + month);
//
        int year = localDay.getYear();
        System.out.println("year年为："+year);
        int monthValue = localDay.getMonthValue();
        System.out.println("monthValue月份为："+monthValue);
        Month month = localDay.getMonth();
        System.out.println("month"+month);
        int dayOfYear = localDay.getDayOfYear();
        System.out.println("这是一年中的第"+dayOfYear+"天");
        int dayOfMonth = localDay.getDayOfMonth();
        System.out.println(monthValue+"月份"+dayOfMonth+"天");
        int hour = localDay.getHour();
        System.out.println(hour+"xiaoshi");
        int minute = localDay.getMinute();
        System.out.println(minute+"分钟");
        DayOfWeek dayOfWeek = localDay.getDayOfWeek();
        System.out.println(dayOfWeek);
//        Month month1 = localDateTime.getMonth();
////        System.out.println(month1);
//
//        //public int getDayOfMonth()     获取月份中的第几天（1-31）
//        int day = localDateTime.getDayOfMonth();
//        System.out.println("日期为" + day);
//
//
//        //public int getDayOfYear()      获取一年中的第几天（1-366）
//        int dayOfYear = localDateTime.getDayOfYear();
//        System.out.println("这是一年中的第" + dayOfYear + "天");
//
//
//        //public DayOfWeek getDayOfWeek()获取星期
//        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
//        System.out.println("星期为" + dayOfWeek);
//
//
//        //public int getMinute()        获取分钟
//        int minute = localDateTime.getMinute();
//        System.out.println("分钟为" + minute);
//        //public int getHour()           获取小时
//
//        int hour = localDateTime.getHour();
//        System.out.println("小时为" + hour);
    }
}
