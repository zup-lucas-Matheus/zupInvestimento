package br.com.zup.InvestimentoZup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class InvestimentoDto {

    @NotBlank(message = "{validation.blank}")
    @Email(message = "{validation.email}")
    private String email;
    @NotBlank(message = "{validation.nome}")
    private String nome;
    private String telefone;
    private Long moneyAplicado;
    private int meses;
    private LocalDate dataDeEntrada;
}
