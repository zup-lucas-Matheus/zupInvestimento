package br.com.zup.InvestimentoZup.investidor;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    //Metódo cadastrar investimento.
    public double saveInvestimento(Investidor investimento) throws Exception {
         repository.save(investimento);
         investimento.getDataDeEntrada();
         return simularInvestimento(investimento);
    }

    //Metódo para simular o investimento do aplicado.
    public double simularInvestimento(Investidor investimento) throws Exception {
        if (investimento.getMoneyAplicado() < 1000) {
            throw new Exception("Valor de investimento não pode ser menor que R$ 1.000");
        }
        else {
            double porcetagem = 0.5;
            return ((investimento.getMoneyAplicado() * porcetagem / 100)  * investimento.getMeses());
        }



    }



}
