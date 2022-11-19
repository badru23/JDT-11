import com.indivara.myapp.access.MyAccess;
import java.lang.String;

public class DemoAccess {
    public static void main(String [] args){
        MyAccess access = new MyAccess();
        TurunanAccess access2 = new TurunanAccess();
        // access.methodPrivate(); 
        access.methodPublic();
        access2.cobaAkses();
        // access.methodDefault();
    }
}