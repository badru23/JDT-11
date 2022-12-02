package id.co.indivara.jdt11.employeesjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DataKagaKetemuException extends Exception{
    public DataKagaKetemuException(String message){
        super(message);
    }
}
