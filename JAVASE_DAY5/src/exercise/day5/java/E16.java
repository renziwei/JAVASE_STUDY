package exercise.day5.java;

import com.sun.org.apache.xerces.internal.impl.msg.XMLMessageFormatter_ja;

/**
 * Created by Administrator on 13-8-17.
 */
//【程序16】题目：输出9*9口诀。
public class E16 {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <10 ; j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
        }
    }
}
