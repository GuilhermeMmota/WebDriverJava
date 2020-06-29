package forgotPassword;

import base.BaseForgotPassword;
import org.testng.annotations.Test;
import pagesForgotPassword.ForgotPassword;
import pagesForgotPassword.PageSucess;

import static org.testng.Assert.assertTrue;

public class ForgtoPassTests extends BaseForgotPassword {

    @Test
    public void testFormForgotEmail(){
        ForgotPassword forgot = home.clickformPage();
        forgot.enterEmail("guilherme@gmail.com");
        PageSucess pageSucess = forgot.clickRetrieveButton();
        assertTrue(pageSucess.getAlert().contains("Your e-mail's been sent!"),
                                                    "Alert text is incorrect");

    }
}
