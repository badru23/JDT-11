public class DemoSepedaMotor {

    public static void uji (SepedaMotor x){
        x.maju();
        x.mundur();
    }

    public static void main(String[]args){
        SepedaMotor supra = new SepedaMotor(2 , 10);
        SepedaMotor mio = new SepedaMotor(2 , 900);
        SepedaMotor standar = new SepedaMotor();
        System.out.println("===================SUPRA==================");
        System.out.println(" Roda Supra : " + supra.roda);
        System.out.println(" Stang Supra : " + supra.stang);
        System.out.println("=====================MIO==================");
        System.out.println(" Roda Mio : " + mio.roda);
        System.out.println(" Stang Mio : " + mio.stang);
        System.out.println("===================STANDAR================");
        System.out.println(" Roda Standar : " + standar.roda);
        System.out.println(" Stang Standar : " + standar.stang);

        System.out.println("==========================================");
        uji(supra);


    }
}