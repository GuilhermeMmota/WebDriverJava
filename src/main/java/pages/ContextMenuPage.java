package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By clickHotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    //usando actions para clicar com o botao direito
    public void clickModal() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(clickHotSpot)).perform();
    }

    // pegando o texto do popup
    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }

    // clicando no ok do popup
    public void acceptPopUp(){
        driver.switchTo().alert().accept();
    }
}
