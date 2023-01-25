package org.acme;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dados")
public class PessoasEntity{
    @Id
    public Long id;
    public Long cpf;
    public String nome;
    public String endereco;

}
