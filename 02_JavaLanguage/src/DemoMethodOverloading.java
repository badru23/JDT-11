public class DemoMethodOverloading {
    static void cetak(){
        System.out.println("==============================");
        System.out.println("Cetak Tanpa Parameter");
        System.out.println("==============================");
    }
    static void cetak(String nama){
        System.out.println("Nama    : " + nama);
        System.out.println("==============================");
    }
    static void cetak(int umur){
        System.out.println("umur    : " + umur);
        System.out.println("==============================");
    }
    static void cetak(String nama , int umur){
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("==============================");
    }
    static void cetak(int umur,String nama){
        System.out.println("Umur    : " + umur);
        System.out.println("Nama    : " + nama);
        System.out.println("==============================");
    }

    public static void main(String [] args){
        cetak();
        cetak("Badru");
        cetak(19);
        cetak("Badru", 19);
        cetak(19 , "Badru");
    }
    
}