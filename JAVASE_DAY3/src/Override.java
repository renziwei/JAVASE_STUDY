/**
 * Created by Administrator on 13-8-10.
 */
public class Override extends Vehicle{
    void road(){
        System.out.println("running in highway or track?");//动态多态性， 覆盖父类Vehicle里的方法
    }

    public static void main(String[] args) {
        Override track=new Override();
        track.road();
    }
}
