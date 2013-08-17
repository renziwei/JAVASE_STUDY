package opp.java;

/**
 * Created by Administrator on 13-8-11.
 */
public class Human {
    private String name;
    private int age;
    private static String earth;//人类只有一个地球。 静态一个实例做出的改变， 其它实例都能看到

    public final void printInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(earth);
    }

    public static void main(String[] args) {
        Human zhangsan= new Human();
        zhangsan.name="张三";
        zhangsan.age=25;
//        Human.earth="地球";
        zhangsan.printInfo();

        Human lisi= new Human();
        lisi.name="李四";
        lisi.age=36;
        Human.earth="太阳";
        lisi.printInfo();

    }
}
