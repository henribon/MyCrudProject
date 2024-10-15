package com.bonbap.mycrudproject.service;

import com.bonbap.mycrudproject.ClienteRepository;
import com.bonbap.mycrudproject.dto.IncludeClientRequestDTO;
import com.bonbap.mycrudproject.mapper.ClientMapper;
import com.bonbap.mycrudproject.model.Client;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@Transactional
public class ClientService extends DefaultService implements CrudService  {

    private final ClienteRepository repository;

    private final ClientMapper mapper;

    public ClientService(ClienteRepository repository, ClientMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public boolean createClient(IncludeClientRequestDTO request) {
        log.info("Creating a new Client on DataBase...");
        log.trace("Creating New Client: {}", request);
        saveClient(request);
        return true;
    }

    private Client saveClient(IncludeClientRequestDTO request) {
        Client client = mapper.requestToModel(request);
        return repository.save(client);
    }


}
