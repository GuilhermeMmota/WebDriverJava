package base;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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
        driver = new EventFiringWebDriver (new FirefoxDriver(getFirefoxOptions()));
        driver.register(new EventReport());

        goHome();
        delcookie();

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

    private FirefoxOptions getFirefoxOptions(){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("disable-infobars");
        return options;
    }
    private void delcookie() {
        Cookie cookie = new Cookie.Builder("optimizelyBuckets", "%7B%7D")
                .domain("https://the-internet.herokuapp.com").build();
                driver.manage().deleteCookie(cookie);
    }

    public WindowManager getWindowManager() { // Metodo p/ saber onde estamos
        return new WindowManager(driver);
    }
}
