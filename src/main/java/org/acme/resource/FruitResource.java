package org.acme.resource;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.acme.entity.Fruit;

@Path("/fruits")
public class FruitResource {

    private Set<Fruit> fruits = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public FruitResource() {
        fruits.add(new Fruit("Maçã", "Fruta do inverno", 1L));
        fruits.add(new Fruit("Abacaxi", "Fruta tropical", 2L));
    }

    @GET
    public Set<Fruit> list() {
        return fruits;
    }

    @POST
    public Set<Fruit> add(Fruit fruit) {
        fruits.add(fruit);
        return fruits;
    }

    @DELETE
    public Set<Fruit> delete(Fruit fruit) {
        // fruits.removeIf(existingFruit -> existingFruit.nome.contentEquals(fruit.nome));
        fruits.removeIf(existingFruit -> existingFruit.id.equals(fruit.id));
        return fruits;
    }

    @PUT
    /*@Path("{id}")
    @Transactional
    public Set<Fruit> update(@PathParam("id")Long id, Fruit fruit){

        if (e)
    } */
    public Response update(Fruit fruit){
        return Response.ok().entity(fruit).build();
    }



}