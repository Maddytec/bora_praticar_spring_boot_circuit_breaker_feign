package br.com.maddytec.endereco.client;

import br.com.maddytec.endereco.dtos.EnderecoViaCepDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br")
public interface ViaCepClient {

    @GetMapping("/ws/{cep}/json/")
    EnderecoViaCepDTO findEndereco(@PathVariable("cep") String cep);
}
