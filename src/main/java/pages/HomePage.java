package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        cliclLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown() {
        cliclLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        cliclLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        cliclLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickSlider() {
        cliclLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts() {
        cliclLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    private void cliclLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
