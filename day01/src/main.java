public class main {
    public static void main(String[] arge){
        //基本数据类型(整数）
        /*
        byte   -128 ~ 127
二进制表现：byte = 8bit --> 0000 0000
        short  -32768 ~ 32767
        int  -2147483648 ~ 2147483647
        long  -9223372036854775808 ~ 9223372036854775807 -
         */
        byte a;
        a = 127;
        System.out.println(a);
        short b;
        b = 32767;
        System.out.println(b); 
        //浮点数，小数
        float c;
        c = 12;
        System.out.println(c);
        double d;
        d = 12.12;
        System.out.println(d);
        //拓展
        double num1 = 10;
        double num2 = 0;
        System.out.println(num1 / num2);
        double num3 = 2.2;
        double num4 = 1.2;
        System.out.println(num3 - num4);
    }
}
