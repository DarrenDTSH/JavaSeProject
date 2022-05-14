package day15_API02Demo.mydate01.mydate01;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDemo5 {
    public static void main(String[] args) throws ParseException {
        //开始时间：2020年11月11日 0:0:0
        //结束时间：2020年11月11日 0:10:0

        //小贾2020年11月11日 0:03:47
        //小皮2020年11月11日 0:10:11


        //1.判断两位同学的下单时间是否在范围之内就可以了。

        //2.要把每一个时间都换算成毫秒值。
        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 0:10:0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();
        String jia = "2020年11月11日 0:03:47";
        String pi = "2020年11月11日 0:10:11";
        long jiaTime = sdf.parse(jia).getTime();
        long piTime = sdf.parse(pi).getTime();
//        System.out.println(startTime);
//        System.out.println(endTime);
        if (startTime<=jiaTime&&jiaTime<=endTime) {
            System.out.println("参与");
        }else{
            System.out.println("huo");
        }
        System.out.println("--------------------");
        if (startTime<=piTime&&piTime<=endTime) {
            System.out.println("参与");
        }else{
            System.out.println("huo");
        }


    }
}
