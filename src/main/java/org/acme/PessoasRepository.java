package org.acme;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.Optional;

public class PessoasRepository {

    @Inject
    EntityManager entityManager;

    public MyEntity cadastrar(MyEntity myEntity) {
        entityManager.persist(myEntity);
        return myEntity;
    }

    public MyEntity consultar(Long idMyEntity){
        MyEntity myEntity = entityManager.find(MyEntity.class, idMyEntity);
        if (myEntity == null) {
            return null;
        }
        return  myEntity;
    }

    public void deletar(long idMyEntity){

    }
}
