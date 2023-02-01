package org.acme;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class FruitResourceTest {

    /*@Test
    public void testList() {
        given()
                .when().get("/fruits")
                .then()
                .statusCode(200)
                .body("$.size()", is(2),
                        "nome", containsInAnyOrder("Maçã", "Abacaxi"),
                        "descricao", containsInAnyOrder("Fruta de inverno", "Fruta tropical"));
    }

    @Test
    public void testAdd() {
        given()
                .body("{\"nome\": \"Pera\", \"descricao\": \"Fruta de inverno\"}")
                .header("Content-Type", MediaType.APPLICATION_JSON)
                .when()
                .post("/fruits")
                .then()
                .statusCode(200)
                .body("$.size()", is(3),
                        "nome", containsInAnyOrder("Maçã", "Abacaxi", "Pera"),
                        "descricao", containsInAnyOrder("Fruta de inverno", "Fruta tropical", "Fruta de inverno"));

        given()
                .body("{\"nome\": \"Pera\", \"descricao\": \"Fruta de inverno\"}")
                .header("Content-Type", MediaType.APPLICATION_JSON)
                .when()
                .delete("/fruits")
                .then()
                .statusCode(200)
                .body("$.size()", is(2),
                        "nome", containsInAnyOrder("Maçã", "Abacaxi"),
                        "descricao", containsInAnyOrder("Fruta de inverno", "Fruta tropical"));
    } */


}