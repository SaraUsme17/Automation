package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstPlanetTest {
    private Response lastFilmresponse;
    private String secondMovieURL;

    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = "https://swapi.dev/api/";
        Response response = RestAssured.get("people/2/");
        //URL de la película 2 (índice 1)
        secondMovieURL = response.then().extract().jsonPath().get("films[1]");

        // Realizar la solicitud GET para la última película
        lastFilmresponse = RestAssured.get(secondMovieURL);

    }

    @Test

    public void FirstPlanet(){

        //Realizar la solicitud GET al primer planeta
        String firstPlanetURL = lastFilmresponse.then().extract().jsonPath().get("planets[0]");
        Response planetResponse = RestAssured.get(firstPlanetURL);

        //Verificar la respuesta
        Assert.assertEquals(planetResponse.getStatusCode(),200);


        //Extraer los valores del planeta
        String gravity = planetResponse.then().extract().jsonPath().getString("gravity");
        String terrains = planetResponse.then().extract().jsonPath().getString("terrain");

        Assert.assertEquals(gravity, "1.1 standard");
        Assert.assertEquals(terrains,"tundra, ice caves, mountain ranges");

        // Obtén la URL de la respuesta del planeta
        String planetURL = planetResponse.then().extract().jsonPath().get("url");

        // Realiza una solicitud GET a esa URL
        Response newPlanetresponse = RestAssured.get(planetURL);

        //Comparación
        Assert.assertEquals(newPlanetresponse.getBody().asString(), planetResponse.getBody().asString());





    }
}
