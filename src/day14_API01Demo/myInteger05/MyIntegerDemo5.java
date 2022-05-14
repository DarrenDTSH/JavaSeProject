package day14_API01Demo.myInteger05;

public class MyIntegerDemo5 {
    //需求：有一个字符串：“91 27 46 38 50”，把其中的每一个数存到int类型的数组中
    //步骤:
    //定义一个字符串
    //把字符串中的数字数据存储到一个int类型的数组中
    //遍历数组输出结果
    public static void main(String[] args) {
        String s="91 27 46 38 50";
        //获取字符串中的每一个数字. split按某个规则分割为字符串返回字符串数组
      String[] str= s.split(" ");
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
        //创建一个int类型的数组.
        int[] inr=new int[str.length];

        //把strArr中的数据进行类型转换并存入到int数组中
        for (int i = 0; i < str.length; i++) {
            inr[i]= Integer.parseInt(str[i]);
        }
        //遍历int类型的数组
        for (int i = 0; i < inr.length; i++) {
            System.out.println(inr[i]);
        }
    }
}
