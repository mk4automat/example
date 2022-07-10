import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DSelectorTest extends ATestBase{

    @Test
    public  void findElements(){

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //Sprawdzenie tekstu na stronie
        driver.findElement(By.xpath("//h1[contains(text(), 'Witaj na stronie testowej')]"));

        //Sprawdzenie buttona po id
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //Sprawdzenie inputa po name
        By firstName = By.name("fname");
        WebElement firstNameInput = driver.findElement(firstName);

        //Lokalizowanie ukrytego elementu za pomocą klasy
        By parraHidden = By.className("topSecret");
        driver.findElement(parraHidden);

        //Lokalizowanie elementu po tagu (jeżeli jest kilka, to zwraca 1)
        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);

        // Wpisanie tekstu w pierwszy imput
        input.sendKeys("Pierwszy input");

        //Lista elementów
        List<WebElement> inputs = driver.findElements(inputLocator);
        //wypisać długoś listy
        System.out.println(inputs.size());

        //Element (href) po całym texcie
        By linkText = By.linkText("Visit W3Schools.com!");
        WebElement schoolLink = driver.findElement(linkText);

        //Element po części tekstu
        By partialLinkText = By.partialLinkText("IamWeirdL");
        WebElement schoolPartial = driver.findElement(partialLinkText);


    }
}
