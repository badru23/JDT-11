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

public class TokoAlatMusik{
    static void test(AlatMusik g){
        g.Play();
        g.Stop();
        g.dijual();
    }

    static void testgitar(AlatMusik g){
        g.dijual();
    }

    public static void main(String [] args){
        
        Gitar gitarku = new Gitar();
        test(gitarku);
        System.out.println("===========================");
        testgitar(gitarku);

        System.out.println("===========================");
        
        Piano pianoku = new Piano();
        test(pianoku);

        // AlatMusik coba = new AlatMusik(); => class abstract tidak bisa di buat objek
    }
}
