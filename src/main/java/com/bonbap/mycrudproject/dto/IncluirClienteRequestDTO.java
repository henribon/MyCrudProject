package com.bonbap.mycrudproject.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class IncluirClienteRequestDTO {

    @NotNull
    private String id;

    @NotNull(message = "O campo nome é obrigatório e não pode ser nulo!")
    private String nome;

    @NotNull(message = "O campo nome é cpf e não pode ser nulo!")
    private String cpf;

    @NotNull(message = "O campo nome é telefone e não pode ser nulo!")
    private String telefone;

}
