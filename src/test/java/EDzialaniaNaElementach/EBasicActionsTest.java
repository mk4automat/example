package EDzialaniaNaElementach;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

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
        //usernameField.sendKeys(Keys.ENTER);
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
        System.out.println(basicPageLink.getText());
        basicPageLink.click();

        //Checkbox
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        //Radiobutton
        driver.findElement(By.cssSelector("[type='radio'][value='male']")).click();

        //Select
        WebElement selectCar = driver.findElement(By.cssSelector("select > option[value='volvo']"));
        selectCar.click();
        //Można też wybrać po klasie select (deselect - odznaczenie)
        WebElement selectCars = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCars);
        cars.selectByVisibleText("Saab");

        //Pobranie textu ze znaczników option z selecta
        List<WebElement> options = cars.getOptions();

        for (WebElement jakasNazwa : options) {
            System.out.println(jakasNazwa.getText());
        }
    }

    @Test
    public void performAction3() {

        driver.get("https://testeroprogramowania.github.io/selenium/");

        //Kliknięcie w element
        By linkTekst = By.linkText("Podstawowa strona testowa");
        WebElement basicPageLink = driver.findElement(linkTekst);
        basicPageLink.click();


        //Usunięcie wartości i wpisanie nowej
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.clear();
        usernameField.sendKeys("nowyUser");

        //Pobranie wartości z pola tekstowego
        System.out.println(usernameField.getAttribute("value"));

        //Pobranie wartości z ukrytego elementu (działa "textContent")
        WebElement para = driver.findElement(By.className("topSecret"));
        System.out.println("By text " + para.getText());
        System.out.println("By attr value: " + para.getAttribute("value"));
        System.out.println("By text content: " + para.getAttribute("textContent"));

    }


    @Test
    public void performAction4() {

        driver.get("https://testeroprogramowania.github.io/selenium/");

        //Kliknięcie w element
        By linkTekst = By.linkText("Podstawowa strona testowa");
        WebElement basicPageLink = driver.findElement(linkTekst);
        basicPageLink.click();

        //Wyświetlenie alertu
        WebElement button = driver.findElement(By.id("clickOnMe"));
        button.click();

        //Alerty: sa tylko 3 opcje [accept(), sendKeys(), dismiss() po poleceniu "driver.switchTo().alert()."]

        driver.switchTo().alert().accept();

    }

}
