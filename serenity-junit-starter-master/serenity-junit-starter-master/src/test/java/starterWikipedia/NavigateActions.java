package starterWikipedia;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {

    @Step("Navigate to the HomePage")
    public void toTheHomePage(){
        openUrl("https://wikipedia.org");
    }

}
