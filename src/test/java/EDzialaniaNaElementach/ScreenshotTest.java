package EDzialaniaNaElementach;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotTest extends ATestBase{

    @Test
    public void screenshot() throws IOException {

        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");

        //Skastowanie drivera do odpowiedniego interfejsu
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        //Pobranie screenshota aplikacji
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("src/test/resources/screenshot.png"));

    }

    @Test
    public void screenshot2() throws IOException {

        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");

        //Dodanie randomowej liczby do nazwy screena
        int randomNumber = (int) (Math.random()*1000);

        //Skastowanie drivera do odpowiedniego interfejsu
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        //Tworzenie stringa
        String fileName = "beforeUpload" + randomNumber + ".png";


        //Pobranie screenshota aplikacji + dodanie końcówki
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("src/test/resources/" + fileName));

    }
}
