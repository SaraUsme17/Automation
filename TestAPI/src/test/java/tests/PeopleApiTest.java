package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PeopleApiTest {

    @Test

    public void getTestPeople2(){

        //Configurar la URL base de la API
        RestAssured.baseURI = "https://swapi.dev/api/";

        //Realizar la solicitud GET
        Response response = RestAssured.get("people/2/");

        //Verificar el estado de la respuesta
        Assert.assertEquals(response.getStatusCode(),200);

        // Mapear la respuesta JSON a un objeto Person
        //Convierte la respuesta JSON de una solicitud HTTP en un objeto JAVA de tipo person
        Person person = response.as(Person.class);

        //Verificar el color de piel
        Assert.assertEquals(person.getSkin_color(),"gold");

        //Verificar lista de films
        Assert.assertEquals(person.getFilms().size(),6);


    }
}
