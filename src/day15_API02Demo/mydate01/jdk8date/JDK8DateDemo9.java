package day15_API02Demo.mydate01.jdk8date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 *  计算两个时间的间隔
 */

public class JDK8DateDemo9 {
    public static void main(String[] args) {
        //public static Period between(开始时间,结束时间)  计算两个"时间"的间隔
        LocalDate dt1= LocalDate.of(2020, 11, 11);
        LocalDate dt2= LocalDate.of(2022, 5,11 );
        Period between = Period.between(dt1, dt2);
        //P28Y11M11D
        System.out.println(between);
        //public int getYears()         获得这段时间的年数
        // 28
        int years = between.getYears();
        System.out.println(years);
        //public int getMonths()        获得此期间的月数
        // 11
        int months = between.getMonths();
        System.out.println(months);
        //public int getDays()          获得此期间的天数
        // 11
        int days = between.getDays();
        System.out.println(days);
        //public long toTotalMonths()   获取此期间的总月数
        // 347
        long sumMonths = between.toTotalMonths();
        System.out.println(sumMonths);

    }
}
