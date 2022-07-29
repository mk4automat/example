package EDzialaniaNaElementach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class GetPageInfoURLTest extends ATestBase {

    @Test
    public void getPageInfo() {

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //Pobranie tytułu strony
        System.out.println(driver.getTitle());

        //Pobranie adresu strony
        System.out.println(driver.getCurrentUrl());

    }

}
