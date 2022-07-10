import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DCssSelectorsTest extends ATestBase{

    @Test
    public void findElementsByCss() {

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

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

        //

    }
}
