package base;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReport;
import utils.WindowManager;

public class BaseTests {

    private EventFiringWebDriver driver; //Evento que captura informações da interface
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        driver = new EventFiringWebDriver (new FirefoxDriver());
        driver.register(new EventReport());

        goHome();

        //https://formy-project.herokuapp.com
        homePage = new HomePage(driver);

//        //put the width and height in Browser
//        Dimension size = new Dimension(375, 812);
//        // Open the Browser in mobile
//        driver.manage().window().setSize(size);
//
//        //Get title of the Browser
//        System.out.println(driver.getTitle());
//        driver.quit();
    }
    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }

    public WindowManager getWindowManager() { // Metodo p/ saber onde estamos
        return new WindowManager(driver);
    }
}
