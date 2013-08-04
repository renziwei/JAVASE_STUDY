/**
 * Created by Administrator on 13-8-4.
 */
public class E4Again {
    public static void main(String[] args) {
        int n=90;
        System.out.print(n + "=");
        method(n);
    }
//    递归算法
    static void method(int n){//n第一次取值90
        for (int i = 2; i <n+1; i++) {//一定要加1，不然最后一个5出不来
            if(n%i==0){
                if(n==i){
                    System.out.print(i);
                }else {
                    System.out.print(i+"*");
                    method(n/i);//n/i 下次赋值的时候n变45
                    break;
                }
            }

        }
    }
}
