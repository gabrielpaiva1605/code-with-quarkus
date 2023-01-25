package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("pessoa")
@Consumes(value = MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class PessoasResource {

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
