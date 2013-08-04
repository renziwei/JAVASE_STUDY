/**
 * Created by Administrator on 13-8-4.
 */
//【程序4】题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
public class E4 {
    public static void main(String[] args) {
        int n=90;
        System.out.print(n+"=");
        method(n);
    }
    static void method(int n){
        for (int j = 2; j <n+1; j++) {
            if(n%j==0){
                if(n==j){
                    System.out.print(j);
                }else{
                    System.out.print(j+"*");
                    method(n/j);
                    break;
                }
            }

        }
    }
}

        