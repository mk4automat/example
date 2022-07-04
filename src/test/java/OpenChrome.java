import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenChrome {

    @Test
    public void openGoogleChromePage() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://seleniumui.moderntester.pl/");
    }
}
