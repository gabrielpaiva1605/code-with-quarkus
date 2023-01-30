package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("pessoa")
@Consumes(value = MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class PessoasResource {

    private Set<MyEntity> myEntities = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public PessoasResource(){
        myEntities.add(new MyEntity("Gabriel", "Av. São Carlos", 19L, 1L));  // L na frente do Long
        myEntities.add(new MyEntity("Paiva", "Av. São Carlos", 19L, 2L));

    }

    @POST
    public Set<MyEntity> add(MyEntity myEntity){
        myEntities.add(myEntity);
        return myEntities;
    }

    @PUT
    public Response edit(MyEntity myEntity){
        return Response.ok().entity(myEntity).build();
    }

    @PATCH
    public Response atualizar(MyEntity myEntity){
        return null;
    }

    @GET
    public Set<MyEntity> list(){
        return myEntities;
    }

    @DELETE
    public Set<MyEntity> delete(MyEntity myEntity) {
        myEntities.remove(myEntity);
        return myEntities;
    }
}
