package starterSauceDemo;

import net.serenitybdd.core.steps.UIInteractions;

public class LoginActions extends UIInteractions {

    public void as(User user){

        openUrl("https://www.saucedemo.com/");

        //driver.findelement(by.cssselector("[data-test='username']")).sendkeys("standard_user");
        //driver.findelement(by.cssselector("[data-test='password']")).sendkeys("secret_sauce");
        //driver.findelement(by.cssselector("[data-test='login-button']")).click();

        find("[data-test='username']").sendKeys(user.getUsername());
        find("[data-test='password']").sendKeys(user.getPassword());
        find("[data-test='login-button']").click();
    }
}
