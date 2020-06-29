package pagesForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

    private WebDriver driver;
    private By enterPage = By.linkText("/form");

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    public Enter clickformPage(){
        driver.findElement(enterPage).click();
        return new Enter(driver);
    }
}
