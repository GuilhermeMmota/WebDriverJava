package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() { // metodo p voltar
        navigate.back();
    }

    public void goForward() { //Metodo p avançar no historico
        navigate.forward();
    }

    public void refreshPage() { // metodo p/ refresh
        navigate.refresh();
    }

    public void goTo(String url) { // Metodo p/ ir a url desejada
        navigate.to(url);
    }

    public void switchToTab(String tabTitle) {
       var windows = driver.getWindowHandles(); // retorna os identificadores

       System.out.println("Number of tabs: " + windows.size()); // retornar quantas guias existem

        System.out.println("Window handles: "); // retornar a alça da janela
        windows.forEach(System.out::println);

        for (String window : windows) { // Metodo p/ janelas e abas
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle()); // pegar o titulo de onde estamos

            if (tabTitle.equals(driver.getTitle())) { // função p sair do loop p/ pagina certa
                break;
            }
        }
    }
}
