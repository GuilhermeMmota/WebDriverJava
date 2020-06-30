package alerts;

import base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AlertTests extends Base {

    @Test
    public void testAccerpctAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccepct();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Results incorrect");
    }

    @Test
    public void testGetTextfromAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();

        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();

        String text = "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccepct();
        assertEquals(alertsPage.getResult(),"You entered: " + text, "Result text incorrect");
    }
}
