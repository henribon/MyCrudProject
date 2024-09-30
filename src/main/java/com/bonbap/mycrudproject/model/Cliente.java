package com.bonbap.mycrudproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "t1209Clt")
public class Cliente {

    @Id
    @Column(name = "id_clt", nullable = false)
    private String id;

    @Column(name = "nm_clt", nullable = false)
    private String nome;

    @Column(name = "num_clt", nullable = false)
    private String cpf;

    @Column(name = "nm_tel", nullable = false)
    private String telefone;

//    @PrePersist
//    public void generateId() {
//        if (id == null) {
//            id = java.util.UUID.randomUUID();
//        }
//    }
}
