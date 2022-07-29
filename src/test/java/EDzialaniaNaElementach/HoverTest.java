package EDzialaniaNaElementach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTest extends ATestBase{

    @Test
    public void hoverTest() {

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //Dodanie actionsa
        Actions actions = new Actions(driver);

        WebElement heading = driver.findElement(By.tagName("h1"));

        //Wywołanie metody moveToElement
        actions.moveToElement(heading).perform();

    }
}
