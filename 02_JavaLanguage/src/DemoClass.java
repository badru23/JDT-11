public class DemoClass {

    DemoClass(){
        System.out.println("Konstruktor pertama dipanggil...");
    }

    DemoClass(String s){
         System.out.println("Konstruktor kedua dipanggil..." + s);
    }

     DemoClass(String s , int a){
         System.out.println("Konstruktor ketiga dipanggil..." + s + a);
    }
    
}