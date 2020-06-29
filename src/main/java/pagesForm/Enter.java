package pagesForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Enter {

    private WebDriver driver;
    private By nameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By jobField = By.id("job-title");
    private By educationField = By.id("radio-button-2");
    private By sexField = By.id("checkbox-1");
    private By yearExperienceField = By.name("0-1");
    private By dateField = By.id("datepicker");
    private By submitButton = By.className(".btn-primary");

    public Enter(WebDriver driver){
        this.driver = driver;
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    public void setLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void setJobField(String job){
        driver.findElement(jobField).sendKeys(job);
    }
    public void setEducation(String education){
        driver.findElement(educationField).click();
    }
    public void setSex(String sex){
        driver.findElement(sexField).click();
    }
    public void setYearExperience(String yearExperience){driver.findElement(yearExperienceField).click(); }
    public void setDate(String date) { driver.findElement(dateField).sendKeys(date); }

    public ThanksPage clickSubmitButton(){
        driver.findElement(submitButton).click();
        return new ThanksPage(driver);
    }
}
