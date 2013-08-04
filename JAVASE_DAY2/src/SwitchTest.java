/**
 * Created by Administrator on 13-8-4.
 */
public class SwitchTest {
    public static void main(String[] args) {
        String s="A";
        switch (s){
            case "A":
                System.out.println("90~100");
                break;
            case "B":
                System.out.println("80~90");
                break;
            case "C":
                System.out.println("60~80");
                break;
            case "D":
                System.out.println("0~60");
                break;
            default:
                System.out.println("error...");
        }

    }
}
