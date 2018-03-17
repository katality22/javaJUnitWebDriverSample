import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Test;
public class SampleTest {

    @Test
    public void testOneShouldPass(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        Assert.assertEquals("Google", driver.getTitle());
        driver.close();
        driver.quit();
    }

    @Test
    public void testTwoShouldFail(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        Assert.assertEquals("Google4", driver.getTitle());
        driver.close();
        driver.quit();
    }
}
