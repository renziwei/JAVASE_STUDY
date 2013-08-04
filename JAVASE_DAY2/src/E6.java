/**
 * Created by Administrator on 13-8-4.
 */
//【程序6】题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
public class E6 {
    public static void main(String[] args) {
    int m=6;
    int n=12;
    int max=(m>n)?m:n;
    int min=(m>n)?n:m;
        for (int i = min; i >0 ; i--) {
            if(m%i==0&&n%i==0){
//最大公约数的算法取最小的值然后递减，但不能小于0.
                System.out.println("最大公约数是"+i);
                break;
            }
        }
        for(int j=max;j<=m*n;j++){
//最大公倍数， 取最大的值递增， 但是不能超过两数相乘
            if(j%m==0&&j%n==0){
                System.out.println("最小公倍数是"+j);
                break;
            }
    }
}
}
