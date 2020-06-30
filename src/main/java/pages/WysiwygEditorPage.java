package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");

    public WysiwygEditorPage(WebDriver driver) { this.driver = driver; }

    // Metodo Limpando o campo do frame
    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    // Metodo para enviar o texto ao frame
    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    // Metodo Verificar se o texto esta correto
    public String getTextFromEditor() {
        switchToEditArea();
       String text = driver.findElement(textArea).getText();
       return text;
    }

    // Metodo para clicar no botão de recuo
    public void decreaseIndention() {
        driver.findElement(decreaseIndentButton).click();
    }

    // Metodo Entrando dentro do frame
    private void switchToEditArea() {
        driver.switchTo().frame(editorIframeId);
    }

    // Metodo Sair do frame
    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}
