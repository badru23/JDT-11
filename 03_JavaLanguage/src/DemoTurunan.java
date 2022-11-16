class Kakek {
    Kakek(String s){
        System.out.println("Constructor Kakek " + s);
    }
}
class Ayah extends Kakek {
    Ayah(String y){
        super(y);
        System.out.println("Constructor Ayah");
    }
}
class Anak extends Ayah {
    Anak(String x){
        super(x);
        System.out.println("Constructor Anak");
    }
}

public class DemoTurunan {
    public static void main(String[] turunan){
        Anak badru = new Anak("mabar kek");

        System.out.println("==============================");

        Ayah bapa = new Ayah("Gasss");
    }
}