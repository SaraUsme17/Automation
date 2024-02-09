package tests;

import io.restassured.RestAssured;
import io.restassured.internal.proxy.RestAssuredProxySelectorRoutePlanner;
import io.restassured.response.Response;
import models.Character;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CharacterTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String driverPath = "C:\\Users\\user\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void waitSomeSeconds(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void name() {

        RestAssured.baseURI = "https://swapi.dev/api/";
        Response response = RestAssured.get("/people/1");
        Assert.assertEquals(response.getStatusCode(), 200);
        Character character = response.as(Character.class);
        Assert.assertEquals(character.getName(), "Luke Skywalker");
        String name = character.getName();
        System.out.println(name);


        driver.navigate().to("https://wikipedia.org/");
        WebElement search = driver.findElement(By.id("searchInput"));
        search.sendKeys(name);
        WebElement button = driver.findElement(By.cssSelector(".pure-button"));
        button.click();

        WebElement title = driver.findElement(By.cssSelector(".mw-page-title-main"));
        Assert.assertEquals(title.getText(),name);
        waitSomeSeconds(5);
        driver.close();

    }


}
