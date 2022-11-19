public class Kalkulator2 {
    static void bagi(int a , int b) throws Exception{
        if (b == 0) {
            throw new Exception("Pembagian tidak boleh dengan nol!");
        } else {
            int hasil = a / b ;
            System.out.println("Nilai anda : " + hasil);
        }
    }

    public static void main(String [] args){
        try{
            bagi(10,1);
        } catch(Exception a){
            System.out.println("Ada Eror : " + a.getMessage());
        }
    }

    // public static void main(String [] args) throws Exception {
    //         bagi(10,0);
    //     } 
    // => Bad Coding    
    }
