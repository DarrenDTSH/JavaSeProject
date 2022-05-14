package day15_API02Demo.mydate01.mydate01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) {
        //当前时间的Date对象
        Date date = new Date();

        //创建了一个日期格式。
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String result = sdf.format(System.currentTimeMillis());
        System.out.println(result);
    }
}
