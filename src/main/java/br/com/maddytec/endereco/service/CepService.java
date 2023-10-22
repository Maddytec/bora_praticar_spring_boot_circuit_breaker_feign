package br.com.maddytec.endereco.service;

import br.com.maddytec.endereco.dtos.CepDTO;

public interface CepService {

    CepDTO findEndereco(String cep);
}
