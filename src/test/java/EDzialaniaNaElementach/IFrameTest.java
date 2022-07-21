package EDzialaniaNaElementach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameTest extends ATestBase{

    @Test
    public void testIFrame() {

        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");

        //Przełączenie do iframe

//        // 1: po numerze iframe:  ["driver.switchTo().frame("nr.iframe, jeżeli jest kilka, od 0")"]
//        driver.switchTo().frame(0);
        //2: Argument WebElement: np. po selektorze
        WebElement iframe = driver.findElement(By.cssSelector("[src='basics.html']"));
        driver.switchTo().frame(iframe);
        //3: Argument String - 1. atr. name, 2. id=name - nie ma przykładu

        //Szukanie elementu na stronie
        driver.findElement(By.id("fname")).sendKeys("Textowy");

        //Wyjście z iframe
        driver.switchTo().defaultContent();
        //Wyświetlenie textu
        System.out.println(driver.findElement(By.tagName("H1")).getText());

    }
}
