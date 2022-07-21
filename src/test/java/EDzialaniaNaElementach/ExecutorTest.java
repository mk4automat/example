package EDzialaniaNaElementach;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExecutorTest extends ATestBase{

    @Test
    public void executeJavaScript() {

        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPage = driver.findElement(By.cssSelector("[href='basics.html']"));

        //Utworzenie JSexecutor
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", basicPage);

    }

    @Test
    public void executeJavaScript2() {

        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPage = driver.findElement(By.cssSelector("[href='basics.html']"));

        //Utworzenie JSexecutor
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        //Kliknięcie
        executor.executeScript("arguments[0].click();", basicPage);

        //Element
        WebElement firstName = driver.findElement(By.name("fname"));
        //Zamiast sendKeys
        executor.executeScript("arguments[0].setAttribute('value', 'Bartek')", firstName);

    }
}
