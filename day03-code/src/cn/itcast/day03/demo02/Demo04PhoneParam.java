package cn.itcast.day03.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "小米";
        one.price = 1000;
        one.color = "土豪金";

        method(one);    //传递进去的参数其实就是地址值
    }

    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
