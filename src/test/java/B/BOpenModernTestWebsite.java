package B;

import org.testng.annotations.Test;

public class BOpenModernTestWebsite extends ATestBase {

    @Test
    public void shouldOpenModernTesterWebsite(){
        driver.get("https://seleniumui.moderntester.pl/");
    }


}
