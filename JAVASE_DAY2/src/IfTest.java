import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 13-8-4.
 */
public class IfTest {
    public static void main(String[] args) {
        int grade = 90;
        if(grade >= 60){
            if(grade>=80){
                if(grade>=90){
                    System.out.println("优秀");
                }else {
                    System.out.println("良好");
                         }
                           }else{
                System.out.println("及格");
            }
        }else{
            System.out.println("不及格");
        }
    }
}
