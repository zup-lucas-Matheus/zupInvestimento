package br.com.zup.InvestimentoZup.exption;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MensagemErroValidation {

    private int statusCode;
    private List<Erro> erros = new ArrayList<>();

    public MensagemErroValidation(int statusCode, List<Erro> erros) {
        this.statusCode = statusCode;
        this.erros = erros;
    }
}
