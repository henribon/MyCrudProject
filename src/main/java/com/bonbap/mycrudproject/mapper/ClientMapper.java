package com.bonbap.mycrudproject.mapper;

import com.bonbap.mycrudproject.dto.IncludeClientRequestDTO;
import com.bonbap.mycrudproject.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "registrationNumber", target = "registrationNumber")
    @Mapping(source = "cellphoneNumber", target = "cellphoneNumber")
    Client requestToModel(IncludeClientRequestDTO request);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "registrationNumber", target = "registrationNumber")
    @Mapping(source = "cellphoneNumber", target = "cellphoneNumber")
    IncludeClientRequestDTO modelToRequest(Client request);
}
