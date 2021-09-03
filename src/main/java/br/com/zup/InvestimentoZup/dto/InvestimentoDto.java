package br.com.zup.InvestimentoZup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.time.LocalDate;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class InvestimentoDto {

    private String email;
    private String nome;
    private String telefone;
    private Long moneyAplicado;
    private int meses;
    private LocalDate dataDeEntrada;
}
