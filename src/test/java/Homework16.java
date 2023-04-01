import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 extends BaseTest {
    @Test
    public static void clickRegistrationLinkTest(){
        String url = "https://bbb.testpro.io/";
        driver.get(url);

        WebElement registrationLink = driver.findElement(By.cssSelector("#hel"));
        registrationLink.click();

        WebElement registrationButton = driver.findElement(By.cssSelector("input[value='Register']"));
        Assert.assertTrue(registrationButton.isDisplayed());

        driver.quit();
    }

}
