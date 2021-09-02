package br.com.zup.InvestimentoZup.Investimento;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    //Metódo cadastrar investimento.
    public double saveInvestimento(Investimento investimento){
         repository.save(investimento);
         return simularInvestimento(investimento);
    }

    //Metódo para simular o investimento do aplicado.
    public double simularInvestimento(Investimento investimento){
        double porcetagem = 0.5;
        return ((investimento.getMoneyAplicado() * porcetagem / 100)  * investimento.getMeses());

    }



}
