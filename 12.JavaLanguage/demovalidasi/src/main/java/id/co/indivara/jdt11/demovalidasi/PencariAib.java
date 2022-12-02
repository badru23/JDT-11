package id.co.indivara.jdt11.demovalidasi;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;                                                                                                                                                                                                .
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class PencariAib extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers , HttpStatus status, WebRequest request) {
        Map<String,Object> body = new LinkedHashMap<>();
        body.put("timestamp",new Date());
        body.put("status", status.value());

        //Ambil Semua Eror
        List<String> aib=ex.getBindingResult()
                .getFieldError()
                .stream()
                .map(x->x.getDefaultMessange())
                .collect(Collectors.toList());
        body.put("Errors", aib);
        return new ResponseEntity<>(body, headers, status);
    }
}
