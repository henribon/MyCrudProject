package com.bonbap.mycrudproject.rest.controller;

import com.bonbap.mycrudproject.dto.ClientResponseDTO;
import com.bonbap.mycrudproject.dto.IncludeClientRequestDTO;
import com.bonbap.mycrudproject.service.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bonbap.mycrudproject.constants.ProjectConstants.URL_CLIENT_V1;

@RestController
@RequestMapping(URL_CLIENT_V1)
public class ClienteController extends DefaultControllerBon{

    private final ClientService service;

    public ClienteController(ClientService service) {
        this.service = service;
    }

    @Operation(summary = "Creates a new client", operationId = "createID", description = "Creates a new client on database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @io.swagger.v3.oas.annotations.media.Content),
            @ApiResponse(responseCode = "500", description = "ERROR", content = @io.swagger.v3.oas.annotations.media.Content)})
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> createNewClient(@RequestBody IncludeClientRequestDTO requestDTO) {
        return super.post(service.createClient(requestDTO));
    }

    @Operation(summary = "List all Clients on the DB", operationId = "listAllId", description = "List all Clients on the DB")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @io.swagger.v3.oas.annotations.media.Content),
            @ApiResponse(responseCode = "500", description = "ERROR", content = @io.swagger.v3.oas.annotations.media.Content)})
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ClientResponseDTO>> listClients() {
        return super.get(service.listClient());
    }
}
