package com.bonbap.mycrudproject;

import com.bonbap.mycrudproject.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

    Optional<Cliente> findById(String id);

    Cliente save(Cliente cliente);
}
