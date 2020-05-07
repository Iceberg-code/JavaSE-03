package cn.itcast.day03.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone phone = getPhone();
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
    }

    //返回值为Phone类型 - 对象类型作为方法的返回值，返回值其实就是对象的地址值
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "华为";
        one.price = 2000;
        one.color = "玫瑰金";
        return one;
    }
}
