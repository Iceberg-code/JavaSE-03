package cn.itcast.day03.demo02;

import javax.crypto.spec.PSource;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据Phone类，创建一名为one的对象
        //格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand);  //null
        System.out.println(one.price);  //0.0
        System.out.println(one.color);  //null
        System.out.println("===============");
        one.brand = "小米";
        one.price = 1000.0;
        one.color = "黑色";
        System.out.println(one.brand);  //小米
        System.out.println(one.price);  //1000.0
        System.out.println(one.color);  //黑色
        System.out.println("===============");

        one.call("雷军");
        one.sendMessage();
    }



}
