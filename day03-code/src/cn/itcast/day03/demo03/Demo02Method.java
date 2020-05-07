package cn.itcast.day03.demo03;
/*
面向对象三大特征：封装、继承和多态。

封装在Java当中的体现：
    1、方法就是一种封装
    2、关键字private也是一种封装

封装就是将一些细节信息隐藏起来，对于外界不可见
*/
public class Demo02Method {
    public static void main(String[] args) {
        int[] arrayA = {10, 20, 30, 40, 50, 60};
        int max = getArray(arrayA);
        System.out.println("最大值是：" + max);
        System.out.println("最大值是：" + getArray(arrayA)); //与上一个语句作用一样
    }

    //给我一个数组，我给你一个最大值
    public static int getArray(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
}
