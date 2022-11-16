/**
    =====================Array=====================
    = array adalah kumpulan data yang membuat banyak value dan semuanya bertipe seragam
    = digunakan untuk menyimpan data yang cukup banyak

 */

 public class DemoArray {
    public static void main(String [] args) {

    //1. Contoh membuat array dengan kata kunci new
     String[] karyawan = new String[3];
     karyawan[0] ="Badru";
     karyawan[1] ="Kamal";
     karyawan[2] ="Dude";
     

     int jumlahKaryawan = karyawan.length;
     System.out.println("Jumlah karyawan " + jumlahKaryawan);
     System.out.println("Karyawan ke 1 : " + karyawan[0]);
     System.out.println("Karyawan ke 2 : " + karyawan[1]);
     System.out.println("Karyawan ke 3 : " + karyawan[2]);
    //  System.out.println("Karyawan ke 4 : " + karyawan[3]); => eror (java.lang.ArrayIndexOutOfBoundsException) 

    System.out.println("========================================================");

    //Contoh Ke 2
    int nilai [] = new int [5] ;
    nilai [0] = 90;
    nilai [1] = 80;
    nilai [2] = 70;
    nilai [3] = 60;
    nilai [4] = 50;

    int jumlahnilai = nilai.length;
    System.out.println("Jumlah Nilai " + jumlahnilai);
    System.out.println("Nilai ke 1 : " + nilai[0]);
    System.out.println("Nilai ke 2 : " + nilai[1]);
    System.out.println("Nilai ke 3 : " + nilai[2]);
    System.out.println("Nilai ke 4 : " + nilai[3]);
    System.out.println("Nilai ke 5 : " + nilai[4]);

    System.out.println("========================================================");
    
    //Contoh membuat Array cara kedua

    String [] kota = {"Jakarta" ,"Bogor" ,"Yogyakarta", "Surabayar", "Bandung"};
    for(int index = 0 ; index < kota.length ; index++){
        System.out.println("Kota ["+ index + "] :  " + kota[index] );
    }

    System.out.println("========================================================");
    //Contoh Kedua
    
    double [] pecahan = {1.2, 2.3 , 3.4};
    for(int index1 = 0 ; index1 < pecahan.length ; index1++){
        System.out.println("pecahan ["+ index1 + "] :  " + pecahan[index1] );
    }

    System.out.println("========================================================");
    //Contoh membuat array cara ke tiga

    String namaSiswa [] ;
    namaSiswa = new String[] {"Badru", "Kamal" , "Dud"};
    for(int index2 = 0 ; index2 < namaSiswa.length ; index2++){
        System.out.println("Nama Siswa ["+ index2 + "] :  " + namaSiswa[index2] );
    }
    }
 }