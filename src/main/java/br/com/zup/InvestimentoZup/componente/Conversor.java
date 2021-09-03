package br.com.zup.InvestimentoZup.componente;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class Conversor {

    @Bean
    public ModelMapper modelMap(){
        return new ModelMapper();
    }

}
