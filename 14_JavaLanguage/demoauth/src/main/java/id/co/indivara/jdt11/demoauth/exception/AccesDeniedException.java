package id.co.indivara.jdt11.demoauth.exception;

public class AccesDeniedException extends RuntimeException{
    public AccesDeniedException(){
        super("Maaf anda tidak berhak melakukan ini !!!");
    }
}
