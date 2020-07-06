package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;


public class Base {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Esperas implicitas.. espera p/ achar o elemento
        goHome();

        //https://formy-project.herokuapp.com
        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) { //Metodo para fazer um ScreenShot quando o teste não passar
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try {
                Files.move(screenshot, new File("resources/screenshot/" + result.getName() + ".png"));
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

//    @AfterMethod
//    public void takeScreenShot() { //Metodo para fazer um ScreenShot quando o teste passar
//        var camera = (TakesScreenshot)driver;
//        File screenshot = camera.getScreenshotAs(OutputType.FILE);
//
//        try {
//            Files.move(screenshot, new File("resources/screenshot/test.png"));
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public WindowManager getWindowManager() { // Metodo p/ saber onde estamos
        return new WindowManager(driver);
    }
}

