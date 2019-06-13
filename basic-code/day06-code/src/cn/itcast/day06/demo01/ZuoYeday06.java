package cn.itcast.day06.demo01;

import java.util.Scanner;

public class ZuoYeday06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("请输入第一个数");
        int a= sc.nextInt();
        System.out.println("请输入第二个数");
        int b= sc.nextInt();
        System.out.println("较大值是"+(a>b?a:b));
    }
}
