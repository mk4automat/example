package EDzialaniaNaElementach;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ClickOnElement extends ATestBase{

    @Test
    public void clickOnElementRightButton() {

        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");


        Actions actions = new Actions(driver);

//        //Kliknięcie prawym przyciskiem w stronę - pusty contextClick()
//        actions.contextClick().perform();

        //Kliknięcie prawym przyciskie w na konkretnym elemencie
        actions.contextClick(driver.findElement(By.id("myFile"))).perform();


    }
}
