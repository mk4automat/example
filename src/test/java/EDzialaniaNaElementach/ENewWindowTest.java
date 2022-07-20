package EDzialaniaNaElementach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class ENewWindowTest extends ATestBase{

    @Test
    public void testNewWindow() {

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //Nowe okno przeglądarki ("driver.switchTo().window("nazwa");)

        //Najpierw pobranie nazwy okna w którym jestem
        String currentWindow = driver.getWindowHandle();
        //Otworzenie nowego okna
        WebElement newPageButton = driver.findElement(By.id("newPage"));
        newPageButton.click();
        //Pobranie nazw wszystkich okien
        Set<String> windowNames = driver.getWindowHandles();
        //Sprawdzenie czy jest inna nazwa niż currentWindow, jeżeli tak, to sie do niej przełączamy
        for (String window: windowNames) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }
        //Wyszukanie elementów w nowym oknie
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("Selenium");

        //Powrót do wcześniejszego okna
        driver.switchTo().window(currentWindow);
        //Znalezienie elementu w pierwszym oknie
        driver.findElement(By.name("username")).sendKeys("XXXXX");

    }
}
