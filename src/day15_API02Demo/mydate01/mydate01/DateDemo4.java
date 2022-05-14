package day15_API02Demo.mydate01.mydate01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
      String date="2022-1-2";

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-mm-dd");
        Date date2=sdf.parse(date);
        System.out.println(date2);
    }
}
