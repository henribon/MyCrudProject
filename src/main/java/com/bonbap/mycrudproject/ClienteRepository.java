package com.bonbap.mycrudproject;

import com.bonbap.mycrudproject.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, String>, JpaSpecificationExecutor<Cliente> {

    @Override
    Optional<Cliente> findById(String id);

    Optional<Cliente> listarClientes();
}
