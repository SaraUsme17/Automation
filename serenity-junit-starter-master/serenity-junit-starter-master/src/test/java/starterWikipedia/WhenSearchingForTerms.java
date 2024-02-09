package starterWikipedia;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchingForTerms {

    //Define the webdriver instance to be used for these tests

    @Managed(driver = "chrome")
    WebDriver driver;

    //Navigate actions. This is the UIInteraction class, so it will be instantiated automatically by Serenity
    NavigateActions navigate;

    //Actions related to searches. his is the UIInteraction class, so it will be instantiated automatically by Serenity
    SearchActions search;

    //A page object representing a Wikipedia article that is currently appearing in the browser
    //Page Objects are initialised by Serenity

    DisplayedArticle displayedArticle;

    @Test
    void searchBySingleKeyword(){
        navigate.toTheHomePage();
        search.searchBy("Microsoft");
        Serenity.reportThat("The first heading should be 'Microsoft'",
                ()-> assertThat(displayedArticle.getFirstHeading().equals("Microsoft")));


    }




}
