import java.util.*;
public class Kalkulator {
    public static void main(String []args){
        Scanner objek = new Scanner(System.in);

        System.out.print("Masukan bilangan satu = ");
        String bil1 = objek.nextLine();
        System.out.print("Masukan bilangan dua = ");
        String bil2 = objek.nextLine();

        try{
        int angkatSatu = Integer.parseInt(bil1);
        int angkatDua = Integer.parseInt(bil2   ); 
        double hasil = (double) angkatSatu / angkatDua;
        System.out.println(bil1 + " / " + bil2 + " = " + hasil); 
        } catch(ArithmeticException e1) {
            System.out.println("Jangan dibagi sama nol coy");
        } catch(NumberFormatException e2) {
            System.out.println("Ga habis thinking malah pembagian Text");
        } catch(Exception e3) {
            System.out.println("Eror coy.." + e3.getMessage());
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}