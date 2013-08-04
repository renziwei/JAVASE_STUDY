/**
 * Created by Administrator on 13-8-4.
 */
//【程序5】题目利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
public class E5 {
    public static void main(String[] args) {
        int grand=52;
        System.out.println((grand>=90)?("A"):((grand>60)?("B"):("C")));
//        if (grand>=90) {
//            System.out.println("A");
//        } else {
//            if(grand>=60){
//            System.out.println("B");
//            } else {
//                System.out.println("C");
//            }
//        }
        }
    }

