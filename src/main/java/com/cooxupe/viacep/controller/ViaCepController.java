package com.cooxupe.viacep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooxupe.viacep.model.ViaCepRetorno;
import com.cooxupe.viacep.service.ViaCepService;


@RestController
@RequestMapping("/api/viacep")
public class ViaCepController {
	
	@Autowired
    private ViaCepService viaCepService;
    

    @GetMapping("/{cep}")
    public ViaCepRetorno consultarCep(@PathVariable String cep) {
    	
        return viaCepService.consultarCep(cep);
        
    }

}
