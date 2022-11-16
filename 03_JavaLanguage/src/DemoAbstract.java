abstract class Satu{
    abstract void coba();
}

abstract class Dua extends Satu{
    void CobaLagi(){
        System.out.println("Coba cuy");
    }
}

class Tiga extends Dua{
    void coba(){
        System.out.println("bro..");
    }
}
public class DemoAbstract {
public static void main(String[]args){
    Satu tiga = new Tiga();
    tiga.coba();
    ((Tiga)tiga).CobaLagi();
}
}