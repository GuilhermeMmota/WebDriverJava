package javascript;

import base.Base;
import org.testng.annotations.Test;

public class JavaScriptTests extends Base {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollFifthParagraph() {
        homePage.clickInfiniteScroll().ScrollToParagraph(5);
    }
}
