package br.com.zup.InvestimentoZup.componente;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class Conversor {

    @Bean
    public ModelMap modelMap(){
        return new ModelMap();
    }

}
