package br.com.maddytec.endereco.service.impl;

import br.com.maddytec.endereco.client.BrasilApiClient;
import br.com.maddytec.endereco.client.ViaCepClient;
import br.com.maddytec.endereco.dtos.CepDTO;
import br.com.maddytec.endereco.service.CepService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class CepServiceImpl implements CepService {

    private final ViaCepClient viaCepClient;

    private final BrasilApiClient brasilApiClient;

    @Override
    @CircuitBreaker(name = "endereco", fallbackMethod = "fallBackFindEndereco")
    public CepDTO findEndereco(String cep) {
        return viaCepClient.findEndereco(cep).to();
    }

    public CepDTO fallBackFindEndereco(String cep, Exception e) {
        return brasilApiClient.findEndereco(cep).to();
    }
}
