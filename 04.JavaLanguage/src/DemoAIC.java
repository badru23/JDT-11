/*
    Anonymous Inner Class
 */

 abstract class Dokter {
    abstract void nyuntik();
 }


 interface Sopir {
    void mengemudi();
 }

 class AnonymousinnerClass {
    Dokter panggilDokter(){
        // RETURN - SEBUAH OBJEK DARI CLASS TANPA NAMA TURUNAN DARI DOKTER
        return new Dokter() {
            void nyuntik(){
                System.out.println("Menyuntik pasien...");
            }
        };
    }
    // RETURN - SEBUAH OBJEK DARI CLASS TANPA NAMA TURUNAN DARI SOPIR
     Sopir panggilSopir(){
        return new Sopir() {
           public void mengemudi(){
                System.out.println("sopir gass...");
            }
        };
    }
    Dosen panggilDosen(){
        return new Dosen();
    }
 }

 class Dosen{
    void mengajar(){
        System.out.println("Ngajar bang..");
    }
 }
public class DemoAIC {
    public static void main(String [] args) {
        AnonymousinnerClass ci =   new AnonymousinnerClass();
        Dokter andi = ci.panggilDokter();
        Sopir bagas = ci.panggilSopir();
        Dosen wawan = ci.panggilDosen();
        bagas.mengemudi();
        andi.nyuntik();
        wawan.mengajar();
    }
}
 