public class DemoJenisMethodNonVoid {
    static int delapan() {
        return  8;
    }
    static int empat() {
        return 4;
    }
    static int kali(int a , int b){
        int hasil = a * b ;
        return hasil;
    }
    public static void main(String []args) {
        //Contoh Pemanggilan satu

        int a = delapan();
        int b = empat();
        int hasil = kali (a,b);
        System.out.println("Hasil Nilai : " + hasil);

        //Contoh Pemanggilan kedua

        System.out.println ("Hasil Nilai : " + kali(delapan(),empat()));
    }
}