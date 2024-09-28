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

    public @NotNull String getId() {
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nome é obrigatório e não pode ser nulo!") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo nome é obrigatório e não pode ser nulo!") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "O campo nome é cpf e não pode ser nulo!") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotNull(message = "O campo nome é cpf e não pode ser nulo!") String cpf) {
        this.cpf = cpf;
    }

    public @NotNull(message = "O campo nome é telefone e não pode ser nulo!") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotNull(message = "O campo nome é telefone e não pode ser nulo!") String telefone) {
        this.telefone = telefone;
    }
}
