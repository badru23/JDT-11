package id.co.indivara.demomap;
import java.util.HashMap;

public class DemoMap {
    public static void main(String [] args ){
        HashMap namaDanUmur =new HashMap();
        namaDanUmur.put("Amir", new  Integer(20));
        namaDanUmur.put("Budi", new  Integer(21));
        namaDanUmur.put("Charlie", new  Integer(22));
        namaDanUmur.put("Dedi", new  Integer(23));
        namaDanUmur.put("Eri", new  Integer(24));

        System.out.println("Amir" + namaDanUmur.get  ("Amir") );
        System.out.println("Budi" + namaDanUmur.get  ("Budi") );
        System.out.println("Charlie" + namaDanUmur.get ("Charlie") );
        System.out.println("Dedi" + namaDanUmur.get  ("Dedi") );
        System.out.println("Eri" + namaDanUmur.get  ("Eri") );

        System.out.println("=====================================");
        for (Object x: namaDanUmur.keySet()){
            Object umur= namaDanUmur.get(x);
            System.out.println(x + " " + umur);
        }

        System.out.println("=====================================");
        HashMap <String,String> negaraDanIbuKota = new HashMap <String,String> ();
        negaraDanIbuKota.put("USA", "Washington D.C.");
        negaraDanIbuKota.put("UK", "London");
        negaraDanIbuKota.put("UAE","Dubai");

        for (String negara : negaraDanIbuKota.keySet()){
            String ibuKota = negaraDanIbuKota.get(negara);
            System.out.println(negara + " " + ibuKota);
        }

        System.out.println("====================================");
        for(java.util.Map.Entry m: negaraDanIbuKota.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("====================================");
        HashMap <String,Object> Kendaraan = new HashMap <String,Object>();
        Kendaraan.put("Avanza", new Mobil());
        Kendaraan.put("Boeing 378", new Pesawat());
        Kendaraan.put("Fortuner", new Mobil());
        Kendaraan.put("AirBus a327", new Pesawat());

        //Solusi 1
         for(java.util.Map.Entry z : Kendaraan.entrySet()){
            if(z.getValue() instanceof Mobil){
                ((Mobil) z.getValue()).jalanMobil();
            }else if (z.getValue() instanceof Pesawat){
                ((Pesawat) z.getValue()).jalanPesawat();
            }
        }

        System.out.println("====================================");
        //Solusi 2
        for(String nama: Kendaraan.keySet()){
            if (Kendaraan.get (nama) instanceof Mobil){
                ((Mobil) Kendaraan.get(nama)).jalanMobil();
            }else if (Kendaraan.get (nama) instanceof Pesawat){
                ((Pesawat) Kendaraan.get(nama)).jalanPesawat();
            }
        }

        Mobil avanza = new Mobil();
        Pesawat boeing = new Pesawat();
        System.out.println("Objec Mobil " + avanza);
        System.out.println("Objec Pesawat " + boeing);

    }
}