package opp.java;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.jar.JarEntry;

/**
 * Created by Administrator on 13-8-11.
 */
public class test {
    public static void main(String[] args) {
        FengZhuang fengzhuang = new FengZhuang();
        System.out.println(fengzhuang.hair);//default在同一个包中可以访问
//        System.out.println(fengzhuang.age);//private只能在同一个类中访问
//        System.out.println(fengzhuang.hight);//default
//        System.out.println(fengzhuang.name);//public 所有的类都可以访问
        System.out.println(fengzhuang.ismarried);
    }

}
