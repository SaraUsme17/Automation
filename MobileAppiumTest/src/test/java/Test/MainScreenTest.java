package Test;

import Screens.MainScreen;
import Utils.Driver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MainScreenTest extends BaseTest{


    @Test
    public void loginScreenTest(){
        this.mainScreen.clickLoginButton();

    }
}
