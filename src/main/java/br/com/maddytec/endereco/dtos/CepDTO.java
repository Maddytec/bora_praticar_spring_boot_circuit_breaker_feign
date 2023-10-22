package br.com.maddytec.endereco.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CepDTO {

    private String cep;
    private String logradouro;
    private String cidade;
    private String estado;
    private String bairro;
}
