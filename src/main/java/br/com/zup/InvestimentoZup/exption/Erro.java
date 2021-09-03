package br.com.zup.InvestimentoZup.exption;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Erro {


    private String mensagem;

    public Erro(String mensagem) {
        this.mensagem = mensagem;
    }
}
