import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OpenEdge {

    @Test
    public void openGoogleEdgePage() {
        WebDriver driver = new EdgeDriver();

        driver.get("https://seleniumui.moderntester.pl/");
    }
}