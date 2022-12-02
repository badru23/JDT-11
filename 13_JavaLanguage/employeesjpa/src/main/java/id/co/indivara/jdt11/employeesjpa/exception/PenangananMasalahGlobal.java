package id.co.indivara.jdt11.employeesjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class PenangananMasalahGlobal {
    @ExceptionHandler(DataKagaKetemuException.class)
    public ResponseEntity jikaTerjadiDataKagaKetemuException(DataKagaKetemuException ex, WebRequest request){
        DetailMasalah dm= new DetailMasalah(new Date(), ex.getMessage(), request.getDescription(false));
        return  new ResponseEntity(dm, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity jikaTerjadiMasalahTakTerduga(Exception ex, WebRequest request){
        DetailMasalah dm =  new DetailMasalah(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(dm, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
