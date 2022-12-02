package id.co.indivara.jdt11.demoauth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class PenangkapAibGlobal extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BookNotFoundException.class)
    public void tanganiBukuKagakKetemu(HttpServletResponse response) throws Exception{
        response.sendError(HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public void tanganiAksesDitolak(HttpServletResponse response) throws Exception{
        response.sendError(HttpStatus.METHOD_NOT_ALLOWED.value());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public void tanganiDataTidakBenar(HttpServletResponse response) throws Exception{
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }
}