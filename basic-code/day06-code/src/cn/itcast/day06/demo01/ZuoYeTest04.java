package cn.itcast.day06.demo01;

public class ZuoYeTest04 {
    public static void main(String[] args) {
        int[] score = {95,92,75,56,98,71,80,58,91,91};
        int sum = 0;
        int avg ;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg = sum /score.length;
                int max = avg ;
        System.out.println("平均数="+avg);
                int count =0 ;
        for (int i = 0; i < score.length; i++) {
            if(max<score[i]){
                count += 1;
//                System.out.println(count);
            }
        }
        System.out.println("高于平均数：80 的个数有"+count+"个");
    }
}
