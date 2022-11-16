//ini class Child

public class SepedaBalap extends Sepeda {
    void ngebut(){
        System.out.println("Ngebut cuy....");
    }

    void berjalan(){
        System.out.println("=====================================START");
        super.berjalan();
        System.out.println("Berjalan ngebuttt..");
        berhenti();
        System.out.println("=====================================END");
     }
}