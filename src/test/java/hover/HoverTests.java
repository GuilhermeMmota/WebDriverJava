package hover;

import base.Base;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class HoverTests extends Base {

    @Test
    public void testHoverUser1() {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        //Se a legenda é exibida
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        //comparar se otexto é igual
        assertEquals(caption.getTitle(),"name: user1", "Caption title incorrect");
        //verificar se o texto do link esta correto
        assertEquals(caption.getLinkText(), "View profile", "Caption Link text incorrect");
        //pegar o link e garantir que todo link termine com ess texto
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
