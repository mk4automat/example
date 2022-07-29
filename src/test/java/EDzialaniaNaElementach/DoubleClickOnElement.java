package EDzialaniaNaElementach;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickOnElement extends ATestBase{

    @Test
    public void doubleClickOnElement() {

        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");


        Actions actions = new Actions(driver);

         //Kliknięcie podwójne na konkretnym elemencie
        actions.doubleClick(driver.findElement(By.id("bottom"))).perform();


    }
}
