package starterSauceDemo;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
//@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLogIn {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;
    InventoryPage inventoryPage;

    //This is the test function
    @Test
    public void userCanLoginViaTheHomePage(){

        login.as(User.STANDARD_USER);
        //To report in a propper way. Icludes a message and a function that makes the assertion
        Serenity.reportThat("The inventory page should include the correct text",
                ()-> assertThat(inventoryPage.getHeading().equalsIgnoreCase("Products"))
                );


    }
}
