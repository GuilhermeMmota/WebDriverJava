package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver) { this.driver = driver; }

    // Metodo para clicar no botão
    public void clickStart() {
        driver.findElement(startButton).click();
        // esperas explicitas/ usamos quando sabemos quando precisamos aguadar
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        // classe Webdriver p/ colocar tempo
        // until = passar a condição esperada
        // ExpectedConditions = classe com metodos p/ aguardar uma condição seja atendida antes de continuar
        // InvisibilityOf = passamos a ele nosso objeto

        FluentWait wait = new FluentWait(driver) //espera fluente
                .withTimeout(Duration.ofSeconds(5)) //tempo limite
                .pollingEvery(Duration.ofSeconds(1)) //sondar a cada 1s
                .ignoring(NoSuchElementException.class); // ignorar

        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingIndicator)));
    }

    public String getLoadingText() {
        return driver.findElement(loadedText).getText();
    }
}
