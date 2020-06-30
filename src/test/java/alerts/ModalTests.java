package alerts;

import base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTests extends Base {

    @Test
    public void testModal() {
        var modalPage = homePage.clickContextMenu();
        modalPage.clickModal();

        String message =  modalPage.getPopUpText();
        modalPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Popup modal incorrect");
    }
}
