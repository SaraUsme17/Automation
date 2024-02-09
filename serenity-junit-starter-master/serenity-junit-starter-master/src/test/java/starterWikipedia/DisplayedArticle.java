package starterWikipedia;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class DisplayedArticle extends PageObject {

    @FindBy(id="firstHeading")
    private WebElementFacade firstHeading;

    public String getFirstHeading(){

        return firstHeading.getText();
    }
}
