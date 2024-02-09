package Test;

import Screens.MainScreen;
import Utils.Driver;
import org.testng.annotations.BeforeTest;
public class BaseTest {
        protected MainScreen mainScreen;

        @BeforeTest
        public void preTest(){
            this.mainScreen = new MainScreen(new Driver().getDriver());
        }
}
