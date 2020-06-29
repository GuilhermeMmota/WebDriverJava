package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    //Metodo para escrever o texto
    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    //Metodo para pegar o resultado
    public String getResult() {
        return driver.findElement(resultText).getText();
    }

    //entrar com caracter pi
    public void enterPi() {
        //chord possibilita enviar varias chaves ao mesmo tempo
        enterText(Keys.chord(Keys.ALT, "227") + "=3.14");
    }
}
