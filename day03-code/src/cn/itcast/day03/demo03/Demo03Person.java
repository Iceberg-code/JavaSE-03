package cn.itcast.day03.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "小米";
//        person.age = 10;    //直接访问private内容，错误写法
        person.setAge(-10);
        person.show();
    }
}
