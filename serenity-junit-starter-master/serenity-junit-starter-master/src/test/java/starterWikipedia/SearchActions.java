package starterWikipedia;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractions {
    @Step("Search by keyword '{0}'")
    public void searchBy(String keyword){
        $("#searchInput").sendKeys(keyword, Keys.ENTER);



    }
}
