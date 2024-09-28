package com.bonbap.mycrudproject.mapper;

import com.bonbap.mycrudproject.dto.IncluirClienteRequestDTO;
import com.bonbap.mycrudproject.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cpf", target = "cpf")
    @Mapping(source = "telefone", target = "telefone")
    Cliente requestToModel(IncluirClienteRequestDTO request);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cpf", target = "cpf")
    @Mapping(source = "telefone", target = "telefone")
    IncluirClienteRequestDTO modelToRequest(Cliente request);
}
