package com.bonbap.mycrudproject.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

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
