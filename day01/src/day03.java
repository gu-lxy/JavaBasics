import java.util.Map;

public class day03 {
    public static void main(String[] args) {
        //brack:结束循环
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                break; //第5次循环结束
            }
            System.out.println("第" + i + "次循环");
        }
        //continue:跳过当前循环
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue; //第5次循环跳过
            }
            System.out.println("第" + i + "次循环");
        }


        //math：随机数
        /*
        人机猜拳：1.石头；2.剪刀；3.布
        人机： computer1   computer2
        赢: computer1.num1; computer2.num2
        平局：num3；
         */
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int a = 0;
        for (int i = 0; i < 1000000000; i++) {
            //猜拳3次结束机制
//            if ((a=num1+num2+num3) == 3){
//                break;
//            }

            int computer1 = ((int) (Math.random() * 10) - 1) / 3;
            int computer2 = ((int) (Math.random() * 10) - 1) / 3;
            //System.out.println(computer1 + "  " + computer2);

            if (computer1 == 0 || computer2 == 0) {
                continue;
            }else if (computer1 == computer2) {
                num3++;
                //System.out.println("平局次数：" + num3);
            }else
            if ((computer1 == 1 && computer2 == 2) || (computer1 == 2 && computer2 == 3) || (computer1 == 3 && computer2 == 1)
            ) {
                num1++;
                //System.out.println("人机1号赢的次数：" + num1);
            } else if ((computer1 == 3 && computer2 == 2) || (computer1 == 1 && computer2 == 3) || (computer1 == 2 && computer2 == 1)){
                num2++;
                //System.out.println("人机2号赢的次数：" + num2);
            }
            a++;
            //人机1号赢得次数等于人机2号的次数机制
            if (num1 > 1000){
                if (num1 == num2){
                    break;
                }
            }
        }
        System.out.println("猜拳次数："+a);
        System.out.println("平局次数：" + num3);
        System.out.println("人机1号赢的次数：" + num1);
        System.out.println("人机2号赢的次数：" + num2);

    }
}
