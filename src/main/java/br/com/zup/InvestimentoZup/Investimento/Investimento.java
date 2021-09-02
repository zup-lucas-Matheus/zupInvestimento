package br.com.zup.InvestimentoZup.Investimento;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "investimentos")
public class Investimento {

    @Id
    private String email;
    private String nome;
    private String telefone;
    private Long moneyAplicado;
    private int meses;


}
