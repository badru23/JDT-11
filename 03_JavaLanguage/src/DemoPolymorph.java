abstract class AlatMusik {
    abstract void Play();
    abstract void Stop();
    void dijual(){
        System.out.println("Toko Dijual");
    }   
}
class Gitar extends AlatMusik {
    void Play(){
        System.out.println("Gitar Play");
    }
     void Stop(){
        System.out.println("Gitar Stop");
    }
    void dijual(){
        System.out.println("Gitar Dijual");
    }
}
class Piano extends AlatMusik {
    void Play(){
        System.out.println("Piano Play");
    }
     void Stop(){
        System.out.println("Piano Stop");
    }
}
class DemoPolymorph {

    public static void main (String[]args){
        AlatMusik gitarku = new Gitar();
        AlatMusik pianoku = new Piano();
        
        AlatMusik [] banyak = new AlatMusik[2];
        banyak[0]=gitarku;
        banyak[1]=pianoku;
        for(int i = 0 ; i < banyak.length; i++){
            banyak[i].Play(); 
            banyak[i].Stop();
            banyak[i].dijual();
        }
    }
}