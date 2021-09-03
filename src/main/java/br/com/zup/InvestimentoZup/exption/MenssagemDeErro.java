package br.com.zup.InvestimentoZup.exption;

import lombok.AllArgsConstructor;


public class MenssagemDeErro extends RuntimeException{

    public MenssagemDeErro(String message) {
        super(message);
    }
}
