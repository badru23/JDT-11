public class SepedaMotor {
    public int roda;
    public int stang;

    public SepedaMotor(int roda , int stang) {
        this.roda = roda;
        this.stang = stang;
    }

    public SepedaMotor() {
        this(2,1);  
    }
    /**
        ini  method 
        buat maju cuy    
     */
    public void maju() {
        System.out.println("Maju");
    }
    
     /**
        ini  method 
        buat mundur cuy    
     */
    public void mundur() {
        System.out.println("Mundur");
    }
}