package Test;

import Screens.LoginScreen;
import org.testng.annotations.Test;

public class LoginScreenTest extends BaseTest{
    LoginScreen loginScreen;

    @Test
    public void loginTest(){

        this.loginScreen = this.mainScreen.clickLoginButton();
        this.loginScreen.sendKeysInputEmail("abc@abc.com");
        this.loginScreen.sendKeysInputPassword("12345678");
        this.loginScreen.clickLoginButton();
    }
}
