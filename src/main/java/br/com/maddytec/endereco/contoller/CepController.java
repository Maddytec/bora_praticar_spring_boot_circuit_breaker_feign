package br.com.maddytec.endereco.contoller;

import br.com.maddytec.endereco.dtos.CepDTO;
import br.com.maddytec.endereco.service.CepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/endereco")
public class CepController {

    private final CepService cepService;

    @GetMapping("/{cep}")
    public CepDTO getEndereco(@PathVariable("cep") String cep){
        return cepService.findEndereco(cep);
    }
}
