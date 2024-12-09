package hermang51.marketplaceapi.exception;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(Exception.class)
@ResponseStatus(HttpStatus.BAD_REQUEST)
public String handleGlobalException(Exception ex) {
    return ex.getMessage();
}

}
