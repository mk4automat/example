package EDzialaniaNaElementach;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EBasicActionsTest extends ATestBase {

    @Test
    public void performAction() {

        driver.get("https://testeroprogramowania.github.io/selenium/");

        //Kliknięcie w element
        By linkTekst = By.linkText("Podstawowa strona testowa");
        WebElement basicPageLink = driver.findElement(linkTekst);
        basicPageLink.click();

        //Kolejny klik
        //driver.findElement(By.id("clickOnMe")).click();

        //Wprowadzenie wartości do pola tekstowego
        driver.findElement(By.id("fname")).sendKeys("Marcin");

        //Usunięcie wartości i wpisanie nowej
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.clear();
        usernameField.sendKeys("nowyUser");

        //Przycisk na klawiaturze Enter
        usernameField.sendKeys(Keys.ENTER);
        //Przycisk na klawiaturze Tab
        //usernameField.sendKeys(Keys.TAB);

        //Checkbox
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
    }

    @Test
    public void performAction2() {

        driver.get("https://testeroprogramowania.github.io/selenium/");

        By linkTekst = By.linkText("Podstawowa strona testowa");
        WebElement basicPageLink = driver.findElement(linkTekst);
        basicPageLink.click();

        //Checkbox
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        //Radiobutton
        driver.findElement(By.cssSelector("[type='radio'][value='male']")).click();

        //Select
        WebElement selectCar = driver.findElement(By.cssSelector("select > option[value='volvo']"));
        selectCar.click();


    }

}
