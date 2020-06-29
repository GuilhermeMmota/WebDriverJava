package slider;

import base.Base;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends Base {

    @Test
    public void testSlider() {
        //Correr o slide
        String value = "4";
        var slider = homePage.clickSlider();
        slider.setclickSlider(value);
        //verificar se correu ate o esperado
        assertEquals(slider.getclickSlider(), value, "Slider value is incorrect");
    }
}
