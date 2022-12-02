package id.co.indivara.demogeneric;

public class DemoGeneric {
    //Contoh method tidak generic
    static  void cetak (String s){
        System.out.println(s);
    }
    
    //Contoh Method Generic
    static <B> void cetakGeneric(B o){
        System.out.println(o);
    }

    static <I,J> void cetakGeneric2(I a , J c){
        System.out.println("i   : " + a + " ,   j    : " + c);
    }


    public static void main(String[]args){
        cetak("Method Tidak Generic");
        cetakGeneric(23);
        cetakGeneric(23.5);
        cetakGeneric("ini Generic");
        cetakGeneric2("Badru",23);
        cetakGeneric2(23,"Badru");

        ClassGeneric c1 = new ClassGeneric(new Satu() , new Dua());
        c1.cetakField();
        ClassGeneric c2 = new ClassGeneric(new Tiga() , new Empat());
        c2.cetakField();

        System.out.println(c1.getFieldSatu());
        System.out.println(c1.getFieldDua());
    }

}