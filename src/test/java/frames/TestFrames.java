package frames;

import base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFrames extends Base {

    @Test
    public void testFramesEdit() {
        var pageFrame = homePage.clickTestFrames();
        assertEquals(pageFrame.getTextAreaLeft(), "LEFT", "Text incorrect");
        assertEquals(pageFrame.getTextAreaBotton(), "BOTTOM", "Text incorrect");
    }
}
