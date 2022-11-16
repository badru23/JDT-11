public class KalkulatorSimple {
    public static void main(String [] args){
        if(args.length < 2){
            System.out.println("Cara Pakai : KalkulatorSimple a b");
        }else{
            int angka1 = Integer.parseInt(args[0]);
            int angka2 = Integer.parseInt(args[1]);
            int jumlah = angka1 + angka2 ;
            int kurang = angka1 - angka2 ;
            int kali = angka1 * angka2 ;
            int bagi = angka1 / angka2 ;
            int modulus = angka1 % angka2 ;
            System.out.println(args[0] +" + "+ args[1] +" = " + jumlah);
            System.out.println(args[0] +" - "+ args[1] +" = " + kurang);
            System.out.println(args[0] +" x "+ args[1] +" = " + kali);
            System.out.println(args[0] +" / "+ args[1] +" = " + bagi);
            System.out.println(args[0] +" % "+ args[1] +" = " + modulus);
            
        }
    } 
}