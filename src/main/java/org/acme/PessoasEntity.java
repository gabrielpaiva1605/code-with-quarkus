package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dados")
public class PessoasEntity extends PanacheEntity {
    public Long id;
    public Long cpf;
    public String nome;
    public String endereco;

}
