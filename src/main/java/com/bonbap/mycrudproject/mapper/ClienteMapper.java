package com.bonbap.mycrudproject.mapper;

import com.bonbap.mycrudproject.dto.IncluirClienteRequestDTO;
import com.bonbap.mycrudproject.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    Cliente requestToModel(IncluirClienteRequestDTO request);
}
