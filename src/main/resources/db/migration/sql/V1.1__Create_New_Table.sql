CREATE TABLE t1209Clt (
    id_clt CHAR(26) NOT NULL,
    nm_clt VARCHAR(30) NOT NULL,
    num_clt VARCHAR(14) NOT NULL,
    nm_tel VARCHAR(16) NOT NULL,
    id_sit VARCHAR(1) NOT NULL,
    CONSTRAINT CLIENTES_PK PRIMARY KEY (id_clt),
    CONSTRAINT clientes_id_clt_UK UNIQUE (id_clt)
)