package br.com.maddytec.endereco.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoBrasilApiDTO {

    private String cep;
    private String street;
    private String neighborhood;
    private String city;
    private String state;

    public CepDTO to(){
        return CepDTO.builder()
                .cep(this.cep)
                .logradouro(this.street)
                .bairro(this.neighborhood)
                .cidade(this.city)
                .estado(this.state)
                .build();
    }
}
