package alerts;

import base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends Base {

    @Test
    public void testFileUpload() {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\Guilherme\\workspace\\testautomation\\webdriver_java\\resources\\geckodriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "geckodriver.exe", "Uploaded incorrect");
    }

}
