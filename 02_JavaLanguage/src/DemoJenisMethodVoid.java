public class DemoJenisMethodVoid{
    static String getnama(String depan ,String Belakang){
        String namalengkap = depan + " " + belakang ;
        return namalengkap ;
    }
    static void cetak(x){
        System.out.println(x);
    }
    public static void main(String[]args){
        //Cara memanggil method
        String nama = namalengkap("Badru", "Kamal");
        cetak (nama);

        //Cara memanggil kedua
        cetak(getnama("Badru" , "Kamal"));
    }
}