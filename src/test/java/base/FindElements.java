package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class FindElements {

        private WebDriver driver;

        public void setUp() {
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://the-internet.herokuapp.com/");

            // Search element in the browser and click
            WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
            inputsLink.click();
            // search and click element
            driver.findElement(By.linkText("Example 1: Menu Element")).click();
            //listar quantos menus tem na pagina
            List<WebElement> menu = driver.findElements(By.tagName("li"));
            System.out.println("numbers of menu is: " + menu.size());

            driver.quit();
        }

        public static void main(String args[]) {
            base.FindElements test = new FindElements();
            test.setUp();
        }

}
