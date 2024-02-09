package WikipediaTest;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WikipediaSearchTest {

    @Managed
    WebDriver driver;

    @Steps
    WikipediaSearchSteps user;

    @Test
    public void searchMicrosoftOnWikipedia() {
        user.openWikipediaHome();
        user.search("Microsoft");
        user.clickSearchButton();
        user.titleContaining("Microsoft");



    }
}
