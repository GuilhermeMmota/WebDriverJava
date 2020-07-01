package wait;

import base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaitTests2 extends Base {

    @Test
    public void testWaitUntilLoaded2() {
        var loadedPage2 = homePage.clickDynamicLoading().clickExample2();
        loadedPage2.clickStart();
        assertEquals(loadedPage2.getLoaded(), "Hello World!", "Loaded text incorrect");
    }
}
