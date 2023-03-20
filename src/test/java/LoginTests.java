import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public static void loginEmptyEmailPasswordTest(){
        login("", "");

        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @Test
    public static void loginValidEmailValidPasswordTest() throws InterruptedException {
        login("demo@class.com", "te$t$tudent");

        Thread.sleep(2000);

        WebElement avatarIcon = driver.findElement(By.cssSelector("img.avatar"));
        Assert.assertTrue(avatarIcon.isDisplayed());
    }
    @Test
    public static void loginInvalidEmailValidPasswordTest(){
        login("invalid@class.com","te$t$tudent");

        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

}