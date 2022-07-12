package DSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DXpathTest extends ATestBase {

    @Test
    public  void findElements(){

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //Sprawdzenie w konsoli: $x("")

        //Sprawdzenie tekstu na stronie
        driver.findElement(By.xpath("//h1[contains(text(), 'Witaj na stronie testowej')]"));

        //Sprawdzenie buttona po id
        By buttonId = By.xpath("/html/body/button[@id='clickOnMe']");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //Sprawdzenie inputa po name
        By firstName = By.xpath("//input[@name='fname']");
        WebElement firstNameInput = driver.findElement(firstName);

        //Lokalizowanie ukrytego elementu za pomocą klasy
        By parraHidden = By.xpath("//p[@class='topSecret']");
        driver.findElement(parraHidden);

        //Lokalizowanie elementu po tagu (jeżeli jest kilka, to zwraca 1)
        By inputLocator = By.xpath("//input");
        WebElement input = driver.findElement(inputLocator);

        // Wpisanie tekstu w pierwszy imput
        input.sendKeys("Pierwszy input");

        //Lista elementów
        List<WebElement> inputs = driver.findElements(inputLocator);
        //wypisać długoś listy
        System.out.println(inputs.size());


        //Element (href) po całym texcie
        By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
        WebElement schoolLink = driver.findElement(linkText);

        //Element po części tekstu
        By partialLinkText = By.xpath("//a[contains(text(),'IamWeirdL')]");
        WebElement schoolPartial = driver.findElement(partialLinkText);


        By fullPath = By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);

        By shortPath = By.xpath("//ul");
        driver.findElement(shortPath);

        //Indeksy w xpath

        //Podajemy który z kilku inputów: "//input[8]" albo "input//input[last()]"
        //Wszystkie zawierające atrybut id: "//*[@id]" albo tylko przyciski: "button[@id]"


        By allXpath = By.xpath("//*");
        driver.findElement(allXpath);

        //Wartosc atrybutu znacznika zawiera część: "//*[contains(@name, 'ame')]"

        //Wartość atrybutu zaczyna się
        By attrStart = By.xpath("//*[starts-with(@name, 'f')]");
        driver.findElement(attrStart);

        //substring - wyciągnięcie części nazwy od końca - l.163

        By attrEq = By.xpath("//button[@id='clickOnMe']");
        By attrNotEq = By.xpath("//*[@id!='clickOnMe']");
        By attrCont = By.xpath("//*[contains(@name,'ame')]");
        By endsWitch = By.xpath("//*[substring(@name,string-length(@name)-string-length('name')+1)='name']");

        driver.findElement(attrEq);
        driver.findElement(attrNotEq);
        driver.findElement(attrCont);
        driver.findElement(endsWitch);

        //Dzieci i wnuki
        //Dzieci
        By child = By.xpath("//div/child::ul");
        //Wnuki i wszystkie w div - * czyli i ul i li
        By desc = By.xpath("//div/descendant::*");
        //Wszystkie body nad div
        By asc = By.xpath("//div/ancestor::body");
        //Bezpośredni rodzic nad div albo nad rodzicem jeszcze
        By parent = By.xpath("//div/../..");
        //Tagi występujące po elemencie
        By foll = By.xpath("//img/following::*");
        //Tagi na tym samym poziomie
        By follSib = By.xpath("//img/following-sibling::*");
        //Tagi występujące przed elementem
        By prec = By.xpath("//img/preceding::*");
        //Tagi występujące przed elementem na tym samym poziomie
        By precSib = By.xpath("//img/preceding-sibling::*");

        driver.findElement(child);
        driver.findElement(desc);
        driver.findElement(asc);
        driver.findElement(parent);
        driver.findElement(foll);
        driver.findElement(follSib);
        driver.findElement(prec);
        driver.findElement(precSib);

        //Dwa selektory szukane równocześnie
        By twoSelectors = By.xpath("//a | //div");
        driver.findElement(twoSelectors);

        //Dwa atrybuty spełnione równocześnie
        By twoAttr = By.xpath("//input[@name='fname' and @id='fname']");
        driver.findElement(twoAttr);

        //Jeden albo drugi atrybut: or
        By orAttr = By.xpath("//input[@name='fame' or @id='fname']");
        driver.findElement(orAttr);

    }
}
