public class PesawatTempur extends Pesawat{
    PesawatTempur(){
        //System.out.println("coba"); => Eror
        super(2,4);
        System.out.println("coba");
    }

    PesawatTempur(int sayap , int mesin){
            super(sayap,mesin);
    }
}