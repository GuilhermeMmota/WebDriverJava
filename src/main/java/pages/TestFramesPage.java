package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestFramesPage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");

    public TestFramesPage(WebDriver driver) { this.driver = driver; }

    public String getTextAreaLeft() {
        driver.switchTo().frame(topFrame); // open the left top
        driver.switchTo().frame(leftFrame); // open the top main
        String text = getFrameText();
        driver.switchTo().parentFrame(); //exit left to top
        driver.switchTo().parentFrame(); //exit top to main
        return text;
    }

    public String getTextAreaBotton() {
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame(); //exit top to main
        return text;
    }

    public String getFrameText() {
        return driver.findElement(body).getText();
    }

}
