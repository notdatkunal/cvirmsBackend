package com.application.cvirms.exception;

        import java.util.LinkedHashMap;
        import java.util.List;
        import java.util.Map;
        import java.util.NoSuchElementException;
        import org.hibernate.exception.ConstraintViolationException;
        import org.springframework.http.HttpHeaders;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.validation.FieldError;
        import org.springframework.validation.ObjectError;
        import org.springframework.web.bind.MethodArgumentNotValidException;
        import org.springframework.web.bind.annotation.ControllerAdvice;
        import org.springframework.web.bind.annotation.ExceptionHandler;
        import org.springframework.web.context.request.WebRequest;
        import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<String> idNotFoundExceptionHandler(IdNotFoundException exception) {

        return new ResponseEntity<String>("No Id found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> noSuchElementExceptionHandler(NoSuchElementException exception) {


        return new ResponseEntity<String>("No Element found for the given id", HttpStatus.NOT_FOUND);
    }


    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<ObjectError> errors = ex.getAllErrors();
        Map<String, String> map = new LinkedHashMap<>();
        for (ObjectError error : errors) {
            String fieldName = ((FieldError) error).getField();
            String message = ((FieldError) error).getDefaultMessage();
            map.put(fieldName, message);
        }
        return new ResponseEntity<Object>(map, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleConstraintViolationException(
            ConstraintViolationException exception) {


        return new ResponseEntity<String>("This filed shold not be null or blank", HttpStatus.BAD_REQUEST);
    }

}