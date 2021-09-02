package br.com.zup.InvestimentoZup.Investimento;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    //Metódo cadastrar investimento.
    public Investimento saveInvestimento(Investimento investimento){
        return repository.save(investimento);
    }


    public double simularInvestimento(Investimento investimento){
        double porcetagem = 0.5;
        return investimento.getMoneyAplicado() * ((porcetagem / 100)) * investimento.getMeses();

    }



}
