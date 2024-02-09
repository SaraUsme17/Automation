package Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://wikipedia.org")
public class WikipediaHomePage extends PageObject {

    @FindBy(name="search")
    private WebElementFacade searchBox;

    //@FindBy(css = "input[type='submit']")
    @FindBy(name = "go")
    private WebElementFacade searchButton;

    public WikipediaHomePage(WebDriver driver) {
        super(driver);
    }

    public void enter_search_term(String text) {
        searchBox.type(text);
    }

    public void click_search_button() {
        searchButton.click();
    }

    public void should_contain_title(String expectedTitle) {
        String actualTitle = getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title matches: " + actualTitle);
        } else {
            System.out.println("Title does not match: " + actualTitle);
        }
    }

}
