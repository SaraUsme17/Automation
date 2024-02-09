package WikipediaTest;

import Pages.WikipediaHomePage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.Keys;


public class WikipediaSearchSteps {

    WikipediaHomePage wikipediaHomePage;

    @Step
    public void openWikipediaHome(){
        wikipediaHomePage.open();

    }

    @Step
    public void search(String text){
        wikipediaHomePage.enter_search_term(text + Keys.RETURN);
    }

    @Step
    public void clickSearchButton() {
        wikipediaHomePage.click_search_button();
    }

    @Step
    public void titleContaining(String expectedTitle) {
        wikipediaHomePage.should_contain_title(expectedTitle);
    }
}
