public class day01 {
    public static void main(String[] arge){
        //基本数据类型的声明与定义
        byte a1;
        a1 = 1;
        byte a2 = 1;

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

        //浮点数，小数基本数据类型
        /*
        1、float   4个字节   单精度   将小数存入float类型变量中时，追加F
        2、double  8个字节   双精度
         */
        float c;
        c = 12.1F;
        System.out.println(c);
        double d;
        d = 12.12;
        System.out.println(d);


        //拓展
        /*
        //        近似值：（额外的知识储备）
        //            float：32bit  1bit 符号位 8bits 指位数
        //            double 64bit  1bit 符号位 11bit 指数位 52bits尾数位
        //         */
        double num1 = 10;
        double num2 = 0;
        System.out.println(num1 / num2);
        double num3 = 2.2;
        double num4 = 1.2;
        System.out.println(num3 - num4);


        //布尔基本数据类型
        /*
        boolean: 1个字节 true/false即“真”或“假”
        注意：Java中的boolean不能参与算术运算
         */
        boolean ture = true;   //直接赋值为真
        System.out.println(ture);
        boolean res = 3 < 2;   //也可用于判断比较
        System.out.println(res);

        //字符
        /*
        ASCII表：
              48 ~ 57 ； 0 ~ 9
              65 ~ 90 ： A ~ Z
              97 ~ 122 ： a ~ z
         */
        char x1 = 65;
        char x2 = 'a';
        char x3 = '猛';
        char x4 = '\u0041';  //通过十六进制在字符集中所对应的字符赋值——A
        char x5 = x1;
        System.out.println(x5);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println( (int)x3 ); //Unicode字符集的编码
        System.out.print(x4);

        //转义字符
              // \n: 换行   \t: 缩进（制表位）
        //char c1 = '\'; //计算机无法识别\
        char c2 = '\\';  //添加\可直接打印出\
        System.out.println(c2);

        //引用数据类型字符串
        String str = null; //字符串内部是字符数组
        String str1 = ""; //""里可以是任意的字符
        String str2 = "hello 世界";
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
    }
}
