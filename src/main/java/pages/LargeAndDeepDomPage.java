package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToTable() { // Metodo para rolar a barra
        WebElement tableElement = driver.findElement(table); // achar a tabela
        String script = "arguments[0].scrollIntoView();"; //codigo js
        ((JavascriptExecutor)driver).executeScript(script, tableElement); //classe p/ executa o js
    }
}
