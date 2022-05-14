package day14_API01Demo.mysystem02;

public class SystemDemo {
    public static void main(String[] args) {
//        public static void exit​(int status)	终止当前运行的 Java 虚拟机，非零表示异常终止
//System.exit(0);


//        public static long currentTimeMillis​()  返回当前时间(以毫秒为单位)
                                   //获取当前时间
//        long start =System.currentTimeMillis();
//        int sum=0;
//        for (int i = 0; i < 100000; i++) {
//            sum+=i;
//        }
//        System.out.println(sum);
//        long end=System.currentTimeMillis();
//        long time=end-start;
//        System.out.println(time+"s");
                                  //获取当前时间
                                 //472 --- 得到的就是这个for循环运行的时间.



//        arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数)	数组copy
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = new int[10];
        //需求:我要把arr1中的数据拷贝到arr2中.
System.arraycopy(arr1,0,arr2,0,arr1.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("--------");
        //我要把arr1最后两个元素,拷贝到arr2的最后两个索引上
System.arraycopy(arr1,arr1.length-2,arr2,arr2.length-2,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
