package com.bonbap.mycrudproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@Entity
@Table(name = "cliente")
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
}
