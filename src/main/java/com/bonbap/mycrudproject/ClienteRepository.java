package com.bonbap.mycrudproject;

import com.bonbap.mycrudproject.dto.domain.DomainClientSituation;
import com.bonbap.mycrudproject.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Client, String> {

    List<Client> findByClientSituation(DomainClientSituation situation);
}
