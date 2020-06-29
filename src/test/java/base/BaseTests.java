package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTests {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //put the width and height in Browser
        Dimension size = new Dimension(375, 812);
        // Open the Browser in mobile
        driver.manage().window().setSize(size);

        //Get title of the Browser
        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
