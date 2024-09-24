package com.bonbap.mycrudproject.service;

import com.bonbap.mycrudproject.ClienteRepository;
import com.bonbap.mycrudproject.dto.IncluirClienteRequestDTO;
import com.bonbap.mycrudproject.mapper.ClienteMapper;
import com.bonbap.mycrudproject.model.Cliente;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class ClienteService extends DefaultService implements CrudService  {

    private final ClienteRepository repository;

    private final ClienteMapper mapper;

    public ClienteService(ClienteRepository repository, ClienteMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public boolean incluirCliente(IncluirClienteRequestDTO request) {
        log.info("Incluindo cliente na base de dados...");
        log.trace("Incluir cliente: {}", request);
        salvarCliente(request);
        return true;
    }

    private Cliente salvarCliente(IncluirClienteRequestDTO request) {
        Cliente cliente = mapper.requestToModel(request);
        return repository.save(cliente);
    }
}
