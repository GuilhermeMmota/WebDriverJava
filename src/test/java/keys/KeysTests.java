package keys;

import base.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTests extends Base {

    @Test
    public void testBackspace() {
        var KeyPage = homePage.clickKeyPresses();
        KeyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(KeyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        var KeyPage = homePage.clickKeyPresses();
        KeyPage.enterPi();
    }
}
