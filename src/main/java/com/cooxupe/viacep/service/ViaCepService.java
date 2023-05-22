package com.cooxupe.viacep.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.cooxupe.viacep.model.ViaCepRetorno;

@Service
public class ViaCepService {
    private final WebClient webClient;
    
    public ViaCepService() {
        this.webClient = WebClient.create("https://viacep.com.br/ws");
    }
    
    public ViaCepRetorno consultarCep(String cep) {
        return webClient.get()
                .uri("/{cep}/json", cep)
                .retrieve()
                .bodyToMono(ViaCepRetorno.class)
                .block();
    }
}