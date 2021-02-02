public class day02 {
    public static void main(String[] args) {
        //类型转换
        short s = 123;
        int i = s; //目标类型大于源类型
        System.out.println(i);

        double d = i;
        System.out.println(d);
        short num = 123;
        byte targert = (byte)num; //强制转换
        System.out.println(targert);

        //小数强转为整数(小数位舍掉)
        double x = 12.34;
        int y = (int)x;
        System.out.println(y);

        //整数强转为整数(整数长度足够，数据完整；不够，数据截断)
        short m = 200;
        byte n = (byte)m;
        System.out.println(n);

        //字符整数互转，数据完整
        char ac = 65;
        int ab = ac;
        System.out.println(ab);

        //类型提升
        double num1 = 1 + 5.2;
        float num2 = 5 + 3.5F;
        long num3 = 3L + 123;
        int num4 = 5 + 8;

        //注：String相加实际为拼接
        String a = "hello";
        int b = 1314;
        String s1 = a + b;
        System.out.println(s1);

        //判断
        if (b == 1314) {
            System.out.println("hello  word");
        }else {
            System.out.println("if判断失败");
        }
        int day = 8;
        switch (day){
            case 1:
                System.out.println("1");
                break;  //防止穿透
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("暂不支持，请重新输入");
                break;
        }

        /*
        局部变量：
              概念：生命在函数内部的变量，必须先赋值在使用
              范围：从定义行开始到所在的代码快结束
         */

        //循环结构
        for (int j = 0;j < 5;j++){  //控制列数
            System.out.println("");
            for (int k = 0;k <= j;k++){  //控制列的个数
                System.out.print("*");
            }
        }
        int nes;
        for (int nu = 1;nu <= 9;nu++){
            System.out.println("");
            for (int mu = 1;mu <= nu;mu++){
                nes =  nu * mu;
                System.out.print(mu+"x"+nu+"="+nes+"  ");
            }
        }
    }
}
