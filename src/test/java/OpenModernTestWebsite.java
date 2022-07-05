import org.testng.annotations.Test;

public class OpenModernTestWebsite extends TestBase{

    @Test
    public void shouldOpenModernTesterWebsite(){
        driver.get("https://seleniumui.moderntester.pl/");
    }
}
