package cn.itcast.day06.demo01;

public class Max {
    public static void main(String[] args) {
        int[] array = {12,23,45,56};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }

        }
        System.out.println(max);
    }
}
