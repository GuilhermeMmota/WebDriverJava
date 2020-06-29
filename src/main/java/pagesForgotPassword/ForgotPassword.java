package pagesForgotPassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By clickRetrieve = By.id("form_submit");

    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public PageSucess clickRetrieveButton() {
        driver.findElement(clickRetrieve).click();
        return new PageSucess(driver);
    }

}
