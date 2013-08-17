package exercise.day5.java;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Administrator on 13-8-17.
 */
//【程序14】题目：输入某年某月某日，判断这一天是这一年的第几天？
public class E14 {
    int year;
    static boolean isLeapYear(int year){
        if(year%400==0||((year%4==0) && (year%100!=0))){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input year:");
        int year=scanner.nextInt();
        System.out.println("input month:");
        int month=scanner.nextInt();
        System.out.println("input day:");
        int day=scanner.nextInt();

        int n=0;
        for (int i = 1; i <month ; i++) {
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    n+=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    n+=30;
                    break;
                case 2:
                    if(isLeapYear(year)){
                        n+=29;
                    }else {
                    n+=28;
                    }
                    break;
            }

        }
        System.out.println(n+day);



    }
}
