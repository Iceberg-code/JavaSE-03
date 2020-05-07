package cn.itcast.day03.demo02;

public class Demo02PhoneTwo {
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
        System.out.println("===============");

        Phone two = new Phone();
        System.out.println(two.brand);  //null
        System.out.println(two.price);  //0.0
        System.out.println(two.color);  //null
        System.out.println("===============");
        two.brand = "华为";
        two.price = 2000.0;
        two.color = "蓝色";
        System.out.println(two.brand);  //华为
        System.out.println(two.price);  //2000.0
        System.out.println(two.color);  //蓝色
        System.out.println("===============");
        two.call("余承东");
        two.sendMessage();
    }



}
