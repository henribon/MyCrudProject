package com.bonbap.mycrudproject;

import com.bonbap.mycrudproject.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Client, String> {
}
