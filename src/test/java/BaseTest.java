import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.UUID;


public class BaseTest {

    public static WebDriver driver = null;
    public static String url = null;
    public static WebDriverWait wait = null;


    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    @Parameters({"BaseURL"})
    public static void launchBrowser(String BaseURL) {
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        url = BaseURL;
        driver.get(url);
    }

    @AfterMethod
    public static void closeBrowser() {
        driver.quit();
    }

//    public static void login(String email, String password){
//        provideEmail(email);
//        providePassword(password);
//        clickSubmit();
//    }

//    public static void navigateToPage() {
//        String url = "https://bbb.testpro.io/";
//        driver.get(url);
//    }

    @DataProvider(name="IncorrectLoginProvider")
    public static Object[][] getDataFromDataProviders(){
        return new Object[][] {
                {"invalid@email.com", "invalidPas"},
                {"demo@mail.com", "invalid"},
                {"", ""}
        };
    }
//    public static void provideEmail(String email) {
//        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));
//
//        emailField.clear();
//        emailField.sendKeys(email);
//    }
//    public static void providePassword(String password) {
//        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
//
//        passwordField.clear();
//        passwordField.sendKeys(password);
//    }
//
//    public static void clickSubmit() {
//        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
//
//        submitButton.click();
//    }
//    public static String generateRandomName() {
//        return UUID.randomUUID().toString().replace("-", "");
//    }
//
//    public static void provideCurrentPassword(String password){
//        WebElement currentPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='current_password']")));
//        currentPassword.clear();
//        currentPassword.sendKeys(password);
//    }
//
//    public static void provideProfileName(String randomName){
//        WebElement profileName = driver.findElement(By.cssSelector("[name='name']"));
//        profileName.clear();
//        profileName.sendKeys(randomName);
//    }
//
//    public static void clickSaveButton(){
//        WebElement saveButton = driver.findElement(By.cssSelector("button.btn-submit"));
//        saveButton.click();
//    }
//
//    public static void clickAvatarIcon() {
//        WebElement avatarIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img.avatar")));
//        avatarIcon.click();
//    }

//    public void playSong(){
//        Actions actions = new Actions(driver);
//        WebElement doubleClickSong = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Dark Days')]")));
//        actions.doubleClick(doubleClickSong).perform();
//    }
//
//    public void isSongPlaying(){
//        WebElement visualizer = driver.findElement(By.cssSelector("div>img[alt='Sound bars']"));
//        Assert.assertTrue(visualizer.isDisplayed());
//    }
//
//    public static void rightClickPlaylist(){
//        WebElement rightClickList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
//        Actions action = new Actions(driver);
//        action.contextClick(rightClickList).perform();
//    }
//
//    public static void deletePlaylist(){
//        WebElement deletePlaylistClick = driver.findElement(By.cssSelector(".playlist-item-menu>ul>li:nth-child(2)"));
//        deletePlaylistClick.click();
//    }
//
//    public static void verifyPlaylistIsDeleted(){
//        WebElement successDeleteMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alertify-logs>.success")));
//        Assert.assertTrue(successDeleteMsg.isDisplayed());
//    }
}
