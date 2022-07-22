package EDzialaniaNaElementach;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPliku extends ATestBase{

    @Test
    public void uploadPLiku() {

        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");

        //Wybranie pliku z kompa
        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\marcin\\Desktop\\selenium_plik\\pierwszy.txt");

    }

    @Test
    public void uploadPLiku2() {

        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");

        //Zewnętrzne narzędzie sikuli (w google "sikulix file upload"/ 189)


    }
}
