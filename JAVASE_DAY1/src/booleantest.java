/**
 * Created by Administrator on 13-8-3.
 */
public class booleantest {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;
        System.out.println(b1&b2);//true
        System.out.println(b1&b3);//false
        System.out.println(b3&b1);//false
        System.out.println(b3&b4);//false
        System.out.println("-----");
        System.out.println(b1|b2);//true
        System.out.println(b1|b3);//true
        System.out.println(b3|b1);//true
        System.out.println(b3|b4);//false
        System.out.println("-----");
        System.out.println(b1^b2);//false
        System.out.println(b1^b3);//true
        System.out.println(b3^b1);//true
        System.out.println(b3^b4);//false
        System.out.println("-----");
        System.out.println(!b3);//true
        System.out.println(!b1);//false
        System.out.println("-----");
        System.out.println(b1&b2);//true
        System.out.println(b1&b3);//false
        System.out.println(b3&b1);//false
        System.out.println(b3&b4);//false
        System.out.println("-----");
        int x=0;
        int y=1;
        System.out.println((x==0)&&((y++)==2));
        System.out.println(y);

    }
}
