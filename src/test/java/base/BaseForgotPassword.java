package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pagesForgotPassword.ForgotHome;

public class BaseForgotPassword {

        private WebDriver driver;
        protected ForgotHome home;

        @BeforeClass
        public void setUp() {
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://the-internet.herokuapp.com/");

            home = new ForgotHome(driver);
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    }



