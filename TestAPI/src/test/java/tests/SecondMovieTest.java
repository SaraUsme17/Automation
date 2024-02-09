package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;

public class SecondMovieTest {
    private String secondMovieURL;


    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = "https://swapi.dev/api/";

        Response response = RestAssured.get("people/2/");

        //URL de la película 2 (índice 1)
        secondMovieURL = response.then().extract().jsonPath().get("films[1]");

    }

    @Test

    public void SecondMovieDetails() {

        //Realizar la solicitud GET
        Response response = RestAssured.get(secondMovieURL);

        //Verificar el estado de la respuesta
        Assert.assertEquals(response.getStatusCode(), 200);

        //Verificar la fecha de publicación
        String releaseDate = response.then().extract().jsonPath().get("release_date");


        //Se realizan múltiples aserciones para verificar que los campos "characters",
        // "planets", "starships", "vehicles" y "species" en la respuesta JSON
        // contienen listas con más de un elemento.

        response.then().assertThat().body("characters", hasSize(greaterThan(1)))
                .body("planets", hasSize(greaterThan(1)))
                .body("starships", hasSize(greaterThan(1)))
                .body("vehicles", hasSize(greaterThan(1)))
                .body("species", hasSize(greaterThan(1)));

        // Verifica el formato de la fecha (YYYY-MM-DD)
        Assert.assertTrue(validateDateFormat(releaseDate, "yyyy-MM-dd"));

        //Verifica que la fecha de la respuesta sea igual a la fecha de la API
        Assert.assertEquals(releaseDate, "1980-05-17");

    }

    @Test
    public void testFilm7() {
        Response response = RestAssured.get("films/7");

        // Verificar el código de respuesta 404
        Assert.assertEquals(response.getStatusCode(), 404);
    }
    private boolean validateDateFormat(String date, String format) {
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(format);
            sdf.setLenient(false);
            sdf.parse(date);
            return true;
        } catch (java.text.ParseException e) {
            return false;
        }
    }
}


