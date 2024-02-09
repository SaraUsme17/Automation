package starterSauceDemo;

import net.thucydides.core.pages.PageObject;

public class InventoryPage extends PageObject {

    public String getHeading(){

        //We can use the $ to find the element in the DOM
        return find(".title").getText();

    }


}
