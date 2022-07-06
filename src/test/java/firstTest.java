import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTest extends TestBase {

    @Test
    public void openGooglePage() {

        driver.get("https://www.google.com");


        // znalezienie przycisku
        WebElement agreeButton = driver
                .findElement(By.xpath("//div[contains(text(), 'Zaakceptuj')][@class='QS5gu sy4vM']"));
        // klikniecie przycisku
        agreeButton.click();

        // znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        // wprowadz wartosc Selenium do pola
        searchField.sendKeys("Selenium");

        // zasymuluj nacisniecie przycisku Enter
        searchField.sendKeys(Keys.ENTER);

        // znalezc rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());
    }
}
