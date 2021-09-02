package br.com.zup.InvestimentoZup.Investimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invest")
public class Controller {

    @Autowired
    private Service service;

}
