package opp.java;

/**
 * Created by Administrator on 13-8-11.
 */
public class FengZhuang {
    private String name;
    private int age;
    private int child;
    private double weight;
    private double hight;
    Hair hair;
    protected boolean ismarried;


    void run(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public boolean isIsmarried() {
        return ismarried;
    }

    public void setIsmarried(boolean ismarried) {
        this.ismarried = ismarried;
    }

    void walk(){
        }

    public static void main(String[] args) {
        FengZhuang fengZhuang=new FengZhuang();
        System.out.println(fengZhuang.getHair());
    }
}

