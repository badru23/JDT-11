public class DemoMobil {
    public static void main(String[]args){

        Mobil fortuner  = new Mobil();
        fortuner.nama ="Toyota fortuner  ";
        fortuner.maju();
        fortuner.mundur();
        fortuner.belok();

        System.out.println("======================");

        Mobil Daihatsu  = new Mobil();
        Daihatsu.nama ="Daihatsu Alya  ";
        Daihatsu.maju();
        Daihatsu.mundur();
        Daihatsu.belok();

        System.out.println("======================");
        fortuner.mesin = 20;
        System.out.println("Mesin Toyota Fortuner : " + fortuner.mesin);
        System.out.println("Mesin Daihatsu Alya : " + Daihatsu.mesin);

        System.out.println("======================");
        Mobil.mesin = 20;
        System.out.println("Mesin Toyota Fortuner : " + fortuner.mesin);
        System.out.println("Mesin Daihatsu Alya : " + Daihatsu.mesin);

        System.out.println("======================");
        Mobil.dijual();
        fortuner.dijual();
    }
}