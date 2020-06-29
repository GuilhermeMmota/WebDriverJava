package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By clickInput = By.cssSelector(".sliderContainer input");
    private By resultTextPage = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    //funçao para correr o slide
    public void setclickSlider(String slider) {
        while(!getclickSlider().equals(slider)) {
            driver.findElement(clickInput).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    //verificar se o texto esta certo
    public String getclickSlider() {
        return driver.findElement(resultTextPage).getText();
    }
}
