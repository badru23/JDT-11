interface ContohFunctionalInterface{
    void makan();
}

//CARA NORMAL

class Satu implements ContohFunctionalInterface{
    public void makan(){
        System.out.println("Makan Cara Normal");
    }
}

public class DemoLamdaExpression {
    static void test(ContohFunctionalInterface c){
        c.makan();
    }

    static ContohFunctionalInterface buatobject(){
        return ()->{
            System.out.println("Hasil dari method buatobject()");
        };
    }
    public static void main(String[] args){
        ContohFunctionalInterface s = new Satu();
        test(s);

        //Cara Lamda Expression 1 baris
        ContohFunctionalInterface x = () -> System.out.println("Makan Cara Lamda Satu baris");
        test(x);

        //Cara Lamda Expression multi baris
        ContohFunctionalInterface Y = ()-> {
            System.out.println("Makan Cara Lamda baris satu");
            System.out.println("Makan Cara Lamda baris dua");
            System.out.println("Makan Cara Lamda baris tiga");
        };
        test(Y);

        ContohFunctionalInterface v = buatobject();
        test(v);
    }
}

