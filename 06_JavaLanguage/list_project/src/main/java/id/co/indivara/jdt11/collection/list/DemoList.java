package id.co.indivara.jdt11.collection.list;
import java.util.*;

public class DemoList {
    public static void main(String[]args){
        ArrayList daftarKota =  new ArrayList();
        daftarKota.add("Jakarta");
        daftarKota.add("Bandung");
        daftarKota.add("Semarang");
        daftarKota.add("Yogyakarta");
        daftarKota.add("Surabaya");

        System.out.println("Isi List    : " + daftarKota.size());
        for(int i = 0 ; i < daftarKota.size(); i++){
            System.out.println("Kota    : " + daftarKota.get(i));
        }
         System.out.println("===============================================");
         ArrayList kandang = new ArrayList();
         kandang.add(new Kambing());
         kandang.add(new Ayam());
         kandang.add(new Kambing());
         kandang.add(new Ayam());
         System.out.println("Isi List    : " + kandang.size());

         for(int j = 0 ; j < kandang.size(); j++){
            if(kandang.get(j) instanceof Kambing){
                ((Kambing) kandang.get(j)).mengembek();
            }else if (kandang.get(j) instanceof Ayam){
                ((Ayam) kandang.get(j)).berkokok();
            }
        }
         System.out.println("===============================================");
         ArrayList <Ayam> kandangAyam = new ArrayList <Ayam>();
         kandangAyam.add(new Ayam());
         kandangAyam.add(new Ayam());
         kandangAyam.add(new Ayam());
         kandangAyam.add(new Ayam());
         kandangAyam.add(new Ayam());
         for (int k=0; k < kandangAyam.size(); k++){
            kandangAyam.get(k).berkokok();
         }

    }
}