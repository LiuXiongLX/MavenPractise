package cn.itcast.day06.demo01;
import java.util.Scanner;

public class FuXiTest01 {
    public static void main(String[] args) {
//    test01();
    test02();
//    test03();
//    test04();
//        test05();
    }

    public static void test01() {
        int sum = 0;
        int i = 1;
        while(i <= 100){
            if(i%2==0){
                sum += i;
            }
           i++;
        }
        System.out.println(sum);
    }

    public static void test02() {
        int sum =0;
        for(int i = 1;i <= 100;i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println(sum);

    }

    public static void test03() {
        int i =1;
        int sum = 0;
        do {
            if (i % 2 == 0){
                sum += i;
            }
            i++;
        } while(i <= 100);
        System.out.println(sum);

    }
//    1.键盘录入一个整数给变量x，输出对应的变量y的值
//	2.x值和y值的对应关系如下：
//    x<0 y=-1
//    x=0 y=0
//    x>0 y=1
//            3.如果用户输入的x的值为2，程序运行后打印格式"x=2,y=1"
public static void test04(){
        Scanner sc =new Scanner(System.in);
    System.out.println("输入一个整数");
            int x = sc.nextInt();
            int y;
    if(x<0){
        y = -1;
    } else if (x == 0){
        y = 0;
    } else{
        y = 1;
    }
    System.out.println("x= "+x+",y="+y);


}
//1.键盘录入学生成绩(整数类型),如果录入的成绩为-1表示录入结束
//	2.打印输出录入的学生成绩的平均值
//
//    例如:
//    请输入学生的成绩:(-1表示结束)
//            80
//    请输入学生的成绩:(-1表示结束)
//            90
//    请输入学生的成绩:(-1表示结束)
//            70
//    请输入学生的成绩:(-1表示结束)
//            -1
//    平均成绩: 80
public static void test05() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int score;
        while(true){
            System.out.println("输入成绩");
            score =sc.nextInt();
            if(score == -1){
                break;
            }
            count++;
            sum += score;

        }
    System.out.println(sum*1.0/count);


}

}
