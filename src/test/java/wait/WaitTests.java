package wait;

import base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends Base {

    @Test
    public void testWaitUntilHidden() {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadingText(), "Hello World!", "Loaded text incorrect");
    }
}
