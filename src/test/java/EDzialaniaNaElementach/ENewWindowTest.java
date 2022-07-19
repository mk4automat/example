package EDzialaniaNaElementach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ENewWindowTest extends ATestBase{

    @Test
    public void performAction4() {

        driver.get("https://testeroprogramowania.github.io/selenium/");

        //Kliknięcie w element
        By linkTekst = By.linkText("Podstawowa strona testowa");
        WebElement basicPageLink = driver.findElement(linkTekst);
        basicPageLink.click();


        //Nowe okno przeglądarki
        WebElement newPageButton = driver.findElement(By.id("newPage"));
        newPageButton.click();

    }
}
