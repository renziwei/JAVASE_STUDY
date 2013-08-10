/**
 * Created by Administrator on 13-8-10.
 */
public class Vehicle {
    String name;
    double speed;
    int age;

    void drive(){

    }
//构造方法
    public Vehicle(String name, double speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }


    void road(){

    }

    public static void main(String[] args) {
        Vehicle car=new Vehicle("BMW",90.2,10);/*括号里一定要赋值，如果前面创建了构造方法， 如果没有， 可以为空*/
        System.out.println(car.name);
        System.out.println(car.speed);
        System.out.println(car.age);

    }



}
