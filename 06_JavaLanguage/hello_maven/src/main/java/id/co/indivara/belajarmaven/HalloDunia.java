package id.co.indivara.belajarmaven;
import org.joda.time.LocalTime;

public class HalloDunia {
   public static void main(String[]args){
    LocalTime sekarang = new LocalTime();
    System.out.println("Waktu saat ini = " + sekarang);

    Salam s = new Salam();
    System.out.println(s.ucapanSalam());
   }
}