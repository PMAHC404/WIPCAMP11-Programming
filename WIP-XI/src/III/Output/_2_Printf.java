/*
 * WIP XI Computer Programing 
 */

package III.Output;

/**
 *
 * @author sittiwatlcp
 */
public class _2_Printf {
    public static void main(String[] args) {
        String firstName = "Wippo";
        String lastName = "Ontour";
        String nickName = "Wip";
        double ownWallet = 200.746352;
        double friendWallet = 500.947855;
        
        System.out.printf("สวัสดี เราชื่อ %s %s (%s) เรามีเงิน %f บาท และเพิ่อนเรามีเงิน %.2f บาท \n", firstName, lastName, nickName, ownWallet, friendWallet);
        
        String Myname = "Champ";
        String Mylastname = "pornpipat";
        double mywallet = 456489.215;
        double myfatherwallet = 52561.525;
        
        System.out.printf("Hello my name is %s %s i have %f and myfather have %.2f baht \n", Myname, Mylastname, mywallet, myfatherwallet );
        
        int money = 5000;
        System.out.printf("i have %d baht \n", money);
    }
}
