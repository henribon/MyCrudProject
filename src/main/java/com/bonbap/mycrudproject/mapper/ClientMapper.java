package com.bonbap.mycrudproject.mapper;

import com.bonbap.mycrudproject.dto.ClientResponseDTO;
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
    @Mapping(source = "clientSituation", target = "clientSituation")
    Client requestToModel(IncludeClientRequestDTO request);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "registrationNumber", target = "registrationNumber")
    @Mapping(source = "cellphoneNumber", target = "cellphoneNumber")
    @Mapping(source = "clientSituation", target = "clientSituation")
    IncludeClientRequestDTO modelToRequest(Client request);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "registrationNumber", target = "registrationNumber")
    @Mapping(source = "cellphoneNumber", target = "cellphoneNumber")
    @Mapping(source = "clientSituation", target = "clientSituation")
    ClientResponseDTO modelToResponse(Client request);
}
