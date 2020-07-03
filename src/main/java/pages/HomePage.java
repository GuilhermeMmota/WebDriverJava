package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        cliclLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown() {
        cliclLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        cliclLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        cliclLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickSlider() {
        cliclLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts() {
        cliclLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        cliclLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenu() {
        cliclLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor() {
        cliclLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public TestFramesPage clickTestFrames() {
        cliclLink("Nested Frames");
        return new TestFramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        cliclLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom() {
        cliclLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll() {
        cliclLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    private void cliclLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
