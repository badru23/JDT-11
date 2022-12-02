package id.co.indivara.belajargradle;
import org.joda.time.LocalTime;


public class HalloDunia {
   public static void main(String[]args){
     LocalTime waktu = new LocalTime();
     System.out.println("Waktu Sekarang = " + waktu);

    Salam s = new Salam();
    System.out.println(s.ucapanSalam());
   }
}