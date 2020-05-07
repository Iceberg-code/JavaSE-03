package cn.itcast.day03.demo03;

public class Demo01VariableDifference {
    String name;    //成员变量

    //成员变量
    public void methodA(){
        int num = 20;   //局部变量
        System.out.println(num);
        System.out.println(name);
    }

    //成员变量
    public void methodB(int param){
        //参数在方法调用的时候，必然会被赋值
        System.out.println(param);

        int age;    //局部变量
//        System.out.println(age);  //局部变量，没赋值，不能用
//        System.out.println(num);    //错误写法！
        System.out.println(name);
    }
}
