package br.com.zup.InvestimentoZup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Simulacaodto {

    private Long moneyAplicado;
    private double rendimento;
    private LocalDate dataDeResgate;

}
