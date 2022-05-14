package day15_API02Demo.mydate01.mydate01;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
//        public long getTime()			获取时间对象的毫秒值
//        public void setTime(long time)		设置时间，传递毫秒值
        Date date = new Date();
        long time=date.getTime();
        System.out.println(time);
        System.out.println(System.currentTimeMillis());
        date.setTime(200);
        System.out.println(date);
        //method1();
        //method2();

    }

    private static void method2() {
        Date date1 = new Date();
        date1.setTime(0L);
        System.out.println(date1);
    }

    private static void method1() {
        //把当前时间封装成一个date对象
        Date date1 = new Date();
        //获取这个date对象的毫秒值 --- 获取当前时间的毫秒值
        long time = date1.getTime();
        System.out.println(time);

        long time2 = System.currentTimeMillis();
        System.out.println(time2);
    }
}
