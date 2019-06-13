package cn.itcast.day06.demo01;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println("输入一个数");
     int x =sc.nextInt();
     int y;

     if(x<0){
         y=-1;
         System.out.println("x="+x+",y="+y);

     }
     else if(x>=0&&x<=0){
         y=0;
         System.out.println("x="+x+",y="+y);
        }
        else {
         y=1;
         System.out.println("x="+x+",y="+y);

        }
//        Scanner sc= new Scanner(System.in);
//        System.out.println("输入一个数");
//        int x=sc.nextInt();
//        int y=0;
//        if(x<0){
//            y=-1;
//        } else if(x>=0&&x<=0){
//            y=0;
//        }
//        else if(x>=2&&x<=2){
//            System.out.println("x=2,y=1");
//        } else{
//            y=1;
//        }
//        System.out.println("y="+y);


    }
}
