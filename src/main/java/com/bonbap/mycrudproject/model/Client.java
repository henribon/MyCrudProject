package com.bonbap.mycrudproject.model;

import com.bonbap.mycrudproject.dto.domain.DomainClientSituation;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "t1209Clt")
public class Client {

    @Id
    @Column(name = "id_clt", nullable = false)
    private String id;

    @Column(name = "nm_clt", nullable = false)
    private String name;

    @Column(name = "num_clt", nullable = false)
    private String registrationNumber;

    @Column(name = "nm_tel", nullable = false)
    private String cellphoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "id_sit", nullable = false)
    private DomainClientSituation clientSituation;
}
