import java.lang.String;

class RekeningBank {
    private int saldo = 1000;

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        if (saldo == 0) {
           System.out.println("ASuuu");
        }else{
            this.saldo = saldo;
        }
    }
}

public class DemoAccess2 {
    public static void main(String[] args){
        RekeningBank bank = new RekeningBank();
        bank.setSaldo(0);

        System.out.println(bank.getSaldo());
    }
}