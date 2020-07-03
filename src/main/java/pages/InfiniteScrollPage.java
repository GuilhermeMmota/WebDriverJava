package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    By textBlocks = By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Scroll until paragraph with index expecified is in view
     * @param index 1-based
     */
    public void ScrollToParagraph(int index) { // Metodo p/ rolar o texto por indice
        String script = "window.scrollTo(0, document.body.scrollHeight)"; // rolagem vertical
        var jsExecutor = (JavascriptExecutor)driver; // salvando a contagem em uma variavel

        while (getNumberOfParagraphsPresent() < index) { // função p/ fazer a rolagem desejada
            jsExecutor.executeScript(script);
        }
    }

    private int getNumberOfParagraphsPresent() { //Metodo p/ dizer quantos paragrafos
        return driver.findElements(textBlocks).size();
    }
}
