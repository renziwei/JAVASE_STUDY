package exercise.day5.java;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by Administrator on 13-8-17.
 */
//【程序15】题目：输入三个整数x,y,z，请把这三个数由小到大输出。
public class E15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input the first number");
        int x=scanner.nextInt();
        System.out.println("input the second number");
        int y=scanner.nextInt();
        System.out.println("input the third number");
        int z=scanner.nextInt();
        int t ;
        if(x>y){
            t=y;
            y=x;
            x=t;
        }
//        System.out.println(x);
        if(x>z){
            t=z;
            z=x;
            x=z;
        }
//        System.out.println(x);
        if(y>z){
            t=z;
            z=y;
            y=t;
        }
//        System.out.println(y);
        System.out.println(x+","+y+","+z);

    }

}
