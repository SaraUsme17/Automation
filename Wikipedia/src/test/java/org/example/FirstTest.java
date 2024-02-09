package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    WebDriver driver = null;

    public void waitSomeSeconds(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWiki() {
        String driverPath = "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.navigate().to("https://wikipedia.org/");
        WebElement search = driver.findElement(By.id("searchInput"));
        search.sendKeys("Microsoft");
        WebElement button = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        button.click();

        String title = driver.getTitle();

        if (title.equals("Microsoft")){
            System.out.println("El título es correcto");
        }else{
            System.out.println("Título incorrecto");

        }
        waitSomeSeconds(5);
        driver.close();


    }
}
