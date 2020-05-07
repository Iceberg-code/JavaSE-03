package cn.itcast.day03.demo01;

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {

        //面向过程：
        int[] arrayA = {10, 20, 30, 40, 50};
        System.out.print("[");
        for (int i = 0; i < arrayA.length; i++) {
            if(i == arrayA.length - 1)
                System.out.println(arrayA[i] + "]");
            else
                System.out.print(arrayA[i] + ", ");
        }
        //System.out.println();
        System.out.println("====================");
        //面向对象：
        //找一个JDK给我们提供好的Arrays类
        //其中有一个toString方法，直接就能把数组变成想要的格式的字符串
        int[] arrayB = {50, 40, 30, 20, 10};
        System.out.println(Arrays.toString(arrayB));    //Arrays.toString - 后面记着按回车，自动导入：import java.util.Arrays;


    }
}
