package cn.itcast.day03.demo03;
//Setter送进去，Getter拿进来
public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("雷军");
        stu.setAge(47);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们儿：" + stu.isMale());
    }
}
