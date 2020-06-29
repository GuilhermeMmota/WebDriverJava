package pagesForgotPassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageSucess {

    private WebDriver driver;
    private By statusAlert = By.id("content");

    public PageSucess(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlert() {
        return driver.findElement(statusAlert).getText();
    }
}
