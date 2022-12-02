package id.co.indivara.jdt11.demoauth.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id){
        super("Book dengan id "+ id + " , hanya ada dikhayalan anda!");
    }
}
