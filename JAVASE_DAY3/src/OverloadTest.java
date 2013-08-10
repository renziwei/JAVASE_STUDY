/**
 * Created by Administrator on 13-8-10.
 */
public class OverloadTest {
    double multiplication(int x, double y){//个数， 类型， 排列顺序
        return x*y;
    }
    int multiplication(int m, int n){
        return m*n;
    }

    public static void main(String[] args) {
        OverloadTest caculate= new OverloadTest();
        System.out.println(caculate.multiplication(3, 900));
    }
}
