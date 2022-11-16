import java.util.*;
public class OneClassThatRuleThemAll {
    public static void main (String[]args){
        Scanner objek = new Scanner(System.in);

        System.out.println("====================================");
        System.out.print("1.  Demo Interface \n");
        System.out.print("1.  Demo Abstract \n");
        System.out.print("1.  Demo TV \n");
        String menu = objek.nextLine();

        while(true){
            if(menu.equals("1")){
                DemoInterface.main(null);
            }else if(menu.equals("2")){
                DemoAbstract.main(null);
            }else if(menu.equals("3")){
                DemoTv.main(null);
            }else{
                System.out.println("Menu yang anda masukan Tidak valid!");
            }
            System.out.println("====================================");
            System.out.println("Mau Pilih menu Kembali? (Y/T)   : ");
            String Jawaban = objek.nextLine();
            if(Jawaban.equals("T")){
                break;
            }

        }
    }
}