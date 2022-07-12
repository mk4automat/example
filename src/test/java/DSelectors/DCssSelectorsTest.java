package DSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DCssSelectorsTest extends ATestBase {

    @Test
    public void findElementsByCss() {

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //w konsoli: $$("")

        //Element css który ma konkretne id
        By cssId = By.cssSelector("#clickOnMe");
        WebElement cssElementClick = driver.findElement(cssId);

        //Element css który ma klase
        By cssClass = By.cssSelector(".topSecret");
        WebElement cssElementTopSecret = driver.findElement(cssClass);

        //Element css który ma klase, drugi sposob
        By cssClass2 = By.cssSelector("[class='topSecret']");
        WebElement css2ElementTopSecret = driver.findElement(cssClass2);

        //Element tag
        By cssTag = By.cssSelector("input");
        WebElement cssElementByTag = driver.findElement(cssTag);

        //Element by name
        By cssName = By.cssSelector("[name='fname']");
        WebElement cssByName = driver.findElement(cssName);

        //Zwrocenie wszystkich tagow na stronie
        By all = By.cssSelector("*");
        WebElement allTagsOnPage = driver.findElement(all);

        //Wszystkie listy - element ul, ktore znajduja sie w divie
        By ulInsideDiv = By.cssSelector("div ul");
        driver.findElement(ulInsideDiv);

        //To samo z pominieciem tbody pomiedzy table a tr
        By trInsideTable = By.cssSelector("table tr");
        driver.findElement(trInsideTable);

        // Pierwsze dziecko jest z >, czyli table > tbody > tr

        //Pierwszy element "form" ktory jest po tagu "label", nie w nim, tylko na tym samym poziomie
        By firstFormUnderLabel = By.cssSelector("label + form");
        driver.findElement(firstFormUnderLabel);

        //Wszytkie elementy "form" ktore sa po tagu "label", nie w nim, tylko na tym samym poziomie
        By everyFormsUnderLabel = By.cssSelector("label ~ form");
        driver.findElement(everyFormsUnderLabel);

        //Zawężenie wartości fname tylko do inputa
        By onlyInput = By.cssSelector("input[name='fname']");
        driver.findElement(onlyInput);

        //Z gwiazdką, szukamy dla wszystkich name, zawiera "ame"
        By ameForEveryInput = By.cssSelector("input[name*='ame']");
        WebElement manyAme = driver.findElement(ameForEveryInput);

        //Wyswietlenie ilości znalezionych ameForEveryInput w konsoli
        List<WebElement> inputs = driver.findElements(ameForEveryInput);
        //wypisać długoś listy
        System.out.println(inputs.size());

        //Z daszkiem, szukamy dla name, który zaczyna się od "f"
        By inputFromF = By.cssSelector("input[name^='f']");
        driver.findElement(inputFromF);

        //Z $, szukamy dla name, który konczy się na "ame"
        By attrEnds = By.cssSelector("input[name$='ame']");
        driver.findElement(attrEnds);
        List<WebElement> inputs2 = driver.findElements(attrEnds);
        //wypisać długoś listy
        System.out.println(inputs2.size());

        //Pierwsze dziecko z listy "li:first-child", ostatnie "li:last-child", kolejne(np.2) "li:nth-child(2)"
        By firstChild = By.cssSelector("li:first-child");
        By lastChild = By.cssSelector("li:last-child");
        By secondChild = By.cssSelector("li:nth-child(2)");

        driver.findElements(firstChild);
        driver.findElements(lastChild);
        driver.findElements(secondChild);

    }
}
