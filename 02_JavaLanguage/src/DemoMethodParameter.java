public class DemoMethodParameter {
  static void cetak(String nama) {
    System.out.println("Nama    : " + nama);
  }

  public static void main(String[] args) {
     //Cara Kepertama
     cetak("Badru");

     //Cara Kedua
     String Mahasiswa = ("Kamal");
     cetak(Mahasiswa);

     //Cara Ketiga
     if (args.length != 0){
        cetak(args[0]);
     }
  }
}
