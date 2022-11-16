
class Manusia {
    void makan(){
        System.out.println("Gua laper cuy..");
    }
}

interface Programming {
  public void ngoding();
  public void debug(); 
}

interface Tidur{
    void ngantuk();
}


class Mahasiswa extends Manusia implements Programming, Tidur {
  public void ngoding() {

    System.out.println("Ngoding mulu bro..");
  }
  public void debug() {
 
    System.out.println("Mending turu..");
  }
  public void ngantuk() {
 
    System.out.println("ngantuk co..");
  }


}

public class DemoInterface {
    static void ujiProgrammer(Programming p){
        p.ngoding();
        p.debug();
    }
    static void ujiTidur(Tidur p){
        p.ngantuk();
    }
    static void ujiMakan(Manusia p){
        p.makan();
    }
  public static void main(String[] args) {
    Mahasiswa siswa = new Mahasiswa(); 
    ujiProgrammer(siswa);
    ujiTidur(siswa);
    ujiMakan(siswa);
  }
}