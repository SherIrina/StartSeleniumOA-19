import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class FerstTest {
    WebDriver wd;


    @BeforeTest
    public void precondition (){
    wd = new ChromeDriver();
    wd.get("https://telranedu.web.app/home");
    }

    @Test
    public void testMethod (){

    }

    @AfterTest
    public void postcondition (){

    }
}
