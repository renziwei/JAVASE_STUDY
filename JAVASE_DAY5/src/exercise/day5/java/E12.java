package exercise.day5.java;

import java.util.Scanner;

/**
 * Created by Administrator on 13-8-17.
 */
//【程序12】题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
public class E12 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println();
        double i=scanner.nextDouble();
        i=28;
        if(i<10){
            System.out.println(i * 0.1);
        }
            if(i<20){
                System.out.println((i-10)*0.075);
            }
                if(i<40){
                    System.out.println((i-20)*0.05);
                    if(i<60){
                        System.out.println((i-40)*0.03);
                        if(i<100){
                            System.out.println((i-60)*0.015);
                            if(i>100){
                                System.out.println((i-100)*0.01);



                    }
                }
            }
        }
    }

}
