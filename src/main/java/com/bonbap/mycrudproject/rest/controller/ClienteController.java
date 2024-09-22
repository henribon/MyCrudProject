package com.bonbap.mycrudproject.rest.controller;

import com.bonbap.mycrudproject.dto.IncluirClienteRequestDTO;
import com.bonbap.mycrudproject.service.ClienteService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.bonbap.mycrudproject.constants.ProjectConstants.URL_CLIENTE_V1;

@RestController
@RequestMapping(URL_CLIENTE_V1)
public class ClienteController extends DefaultControllerBon{

    ClienteService service;

    @Operation(summary = "Inclui um cliente", operationId = "incluiID", description = "Inclui um cliente no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sucesso - Retorna uma lista de clientes"),
            @ApiResponse(responseCode = "404", description = "Não encontrado - Não foram encontrados clientes", content = @io.swagger.v3.oas.annotations.media.Content),
            @ApiResponse(responseCode = "500", description = "Erro interno - Erro interno durante a recuperação de clientes", content = @io.swagger.v3.oas.annotations.media.Content)})
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> incluirCliente(@Valid @RequestBody IncluirClienteRequestDTO request) {
        return super.post(service.incluirCliente(request));
    }
}
