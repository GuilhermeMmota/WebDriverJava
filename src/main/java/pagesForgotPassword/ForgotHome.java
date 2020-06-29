package pagesForgotPassword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotHome {

    private WebDriver driver;
    private By PageForgot = By.linkText("Forgot Password");

    public ForgotHome(WebDriver driver) {
        this.driver = driver;
    }
    public ForgotPassword clickformPage() {
        driver.findElement(PageForgot).click();
        return new ForgotPassword(driver);
    }
}
