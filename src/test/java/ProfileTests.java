import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTest {

    @Test
    public static void updateProfileNameTest () throws InterruptedException {
        login("nicoleliano1@yahoo.com", "1te$tpa$$word");

        Thread.sleep(2000);

        clickAvatarIcon();
        String randomName = generateRandomName();

        provideCurrentPassword("1te$tpa$$word");
        provideProfileName(randomName);
        clickSaveButton();

        Thread.sleep(2000);

        WebElement actualProfileName = driver.findElement(By.cssSelector("a.view-profile>span"));
        Assert.assertEquals(actualProfileName.getText(), randomName);
    }
}
