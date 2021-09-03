package br.com.zup.InvestimentoZup.handller;

import br.com.zup.InvestimentoZup.exption.Erro;
import br.com.zup.InvestimentoZup.exption.MensagemErroValidation;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestControllerAdvice
public class CapturaDeExption {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MensagemErroValidation manipularExption(MethodArgumentNotValidException exception){

        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        List<Erro> errors = fieldErrors.stream().map(objeto -> new Erro(objeto.getDefaultMessage())).collect(Collectors.toList());
        return new MensagemErroValidation(400, errors);

    }



}
