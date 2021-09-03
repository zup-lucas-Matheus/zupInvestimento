package br.com.zup.InvestimentoZup.investidor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "investimentos")
public class Investidor {

    @Id
    private String email;
    private String nome;
    private String telefone;
    private Long moneyAplicado;
    private int meses;
    private LocalDate dataDeEntrada;


}
