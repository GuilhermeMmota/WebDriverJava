package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    //Importar webdriver
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    //JavaDoc
    /**
     *
     * @param index start at 1
     */
    //Metodo Actions para passar o mouse
    //troca de void para figureCaption
    public FigureCaption hoverOverFigure(int index) {
        //Pegar a figura que queremos
        WebElement figure = driver.findElements(figureBox).get(index - 1);

        Actions actions = new Actions(driver);
        //moveToElement evento que passa o mouse sobre o elemento
        actions.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement(boxCaption));
    }

    // classe para tratar da legenda e figura
    public class FigureCaption{

        private WebElement caption;
        private By header = By.tagName("h5");
        private  By link = By.tagName("a");

        //construtor que aceite elemet da web
        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        //saber se a legenda esta sendo exibida
        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }
        // saber qual é o titulo e verificar se esta correto
        public String getTitle() {
            return caption.findElement(header).getText();
        }
        //// Passar o href para obter o link
        public String getLink() {
            return caption.findElement(link).getAttribute("href");
        }
        //Pegar o texto do link
        public String getLinkText() {
            return caption.findElement(link).getText();
        }
    }
}
