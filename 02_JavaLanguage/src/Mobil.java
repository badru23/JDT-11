public class Mobil {
    
    static int mesin = 1;
    int roda  = 4;
    int pintu = 5;
    String nama ="";

    void maju(){
        System.out.println(nama + "Maju..");
    }
    
    void mundur(){
        System.out.println(nama + "Mundur..");
    }
    
    void belok(){
        System.out.println(nama + "Belok..");
    }

    static void dijual(){
        System.out.println("Dijual..");
    }
    
}