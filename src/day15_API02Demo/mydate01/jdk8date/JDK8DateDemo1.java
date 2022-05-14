package day15_API02Demo.mydate01.jdk8date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JDK8DateDemo1 {
    public static void main(String[] args) throws ParseException {
        //JDKMethod();

        String s = "2020年11月11日 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long daytime = 1000 * 60 * 60 * 24;
        long time = sdf.parse(s).getTime();
        time += daytime;
        String result2 = sdf.format(time);
        System.out.println(result2);

//        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
//        LocalDateTime localDateTime = LocalDateTime.parse(s, pattern);
//        LocalDateTime newLocalDateTime = localDateTime.plusDays(1);
//        String result = newLocalDateTime.format(pattern);
//        System.out.println(result);
        System.out.println("---------------------------");
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(s, pattern);
        LocalDateTime newDate = parse.plusDays(1);
        String result = newDate.format(pattern);
        System.out.println(result);
    }

    private static void JDKMethod() throws ParseException {
        String s = "2020年11月11日 00:00:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(s);
        long time = date.getTime();
        time = time + (1000 * 60 * 60 * 24);
        Date newDate = new Date(time);
        String result = sdf.format(newDate);
        System.out.println(result);
    }
}
