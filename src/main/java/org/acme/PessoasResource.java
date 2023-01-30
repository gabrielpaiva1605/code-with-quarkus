package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.HashMap;
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
    public Response cadastrar(MyEntity myEntity){
        return Response.ok().entity(myEntity).build();
    }

    @PUT
    public Response editar(MyEntity myEntity){
        return Response.ok().entity(myEntity).build();
    }

    @PATCH
    public Response atualizar(MyEntity myEntity){
        return null;
    }

    @GET
    public Response consultar(Long idMyEntity){
        return null;
    }

    @DELETE
    public Response deletar(Long idMyEntity){
        return null;
    }
}
