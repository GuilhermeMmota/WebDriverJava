package pagesForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThanksPage {

    private WebDriver driver;
    private By statusAlert = By.className("alert alert-success");

    public ThanksPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
