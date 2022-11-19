public class DemoCustomExpception {
    static void bagi(int a , int b) throws JDTException{
        if (b == 0) {
            throw new JDTException("Pembagian tidak boleh dengan nol!");
        } else {
            int hasil = a / b ;
            System.out.println("Nilai anda : " + hasil);
        }
    }
     public static void main(String [] args) throws JDTException {
            bagi(10,0);
        } 
}