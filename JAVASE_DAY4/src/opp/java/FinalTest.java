package opp.java;

/**
 * Created by Administrator on 13-8-11.
 */
public class FinalTest extends Human {
    private final int i;

    public FinalTest(int i) {//在域前加final的时候，只能在声明时或构造方法中被初始化， 此后值不能改变
        this.i = i;
    }
//
//    public void printInfo(){// 父类中已经定义了这个方法是final 所以子类中不能重写
//
//    }
    public static void main(String[] args) {
        FinalTest a=new FinalTest(10);
        System.out.println(a.i);

        Human human=new Human();
        human.printInfo();
    }
}


