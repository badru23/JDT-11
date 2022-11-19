import com.indivara.myapp.lib.ContohLibrary;
import com.indivara.myapp.util.*;
import com.indivara.myapp.*;
import java.lang.String;

public class PanggilLibrary {
  public static void main(String[] args) {
    ContohLibrary cl = new ContohLibrary();
    cl.ContohCetakLibrary();

    ContohUtility util = new ContohUtility();
    util.ContohCetakUtility();

    
    CallLib call = new CallLib();
    call.manggillib();

    CallUtil callU = new CallUtil();
    callU.manggilUtil();
  }
}