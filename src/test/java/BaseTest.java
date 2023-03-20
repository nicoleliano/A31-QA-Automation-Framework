import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.UUID;

public class BaseTest {
    public static WebDriver driver = null;
    public static String url = "https://bbb.testpro.io/";

    @BeforeSuite
    static void setupClass(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public static void launchBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public static void closeBrowser(){
        driver.quit();
    }

    public static void clickSubmit() {
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();
    }

    public static void providePassword(String password) {
        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public static void provideEmail(String email) {
        WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
        emailField.clear();
        emailField.sendKeys(email);
    }

    public static void login(String email, String password){
        navigateToPage();
        provideEmail(email);
        providePassword(password);
        clickSubmit();
    }

    public static void navigateToPage() {
        String url = "https://bbb.testpro.io/";
        driver.get(url);
    }

    public static String generateRandomName(){
        return UUID.randomUUID().toString().replace("-", "");

    }

    public static void provideCurrentPassword(String password){
        WebElement currentPassword = driver.findElement(By.cssSelector("[name='current_password']"));
        currentPassword.sendKeys(password);
    }

    public static void provideProfileName(String randomName){
        WebElement profileName = driver.findElement(By.cssSelector("[name='name']"));
        profileName.clear();
        profileName.sendKeys(randomName);
    }

    public static void clickSaveButton(){
        WebElement saveButton = driver.findElement(By.cssSelector("button.btn-submit"));
        saveButton.click();
    }

    public static void clickAvatarIcon(){
        WebElement avatarIcon = driver.findElement(By.cssSelector("img.avatar"));
        avatarIcon.click();
    }

    public static void addNewPlaylistButton(){
        WebElement addPlaylistButton = driver.findElement(By.cssSelector("[data-testid='sidebar-create-playlist-btn']"));
        addPlaylistButton.click();
    }

    public static void clickNewPlaylist(){
        WebElement newPlaylist = driver.findElement(By.cssSelector("[data-testid='playlist-context-menu-create-simple']"));
        newPlaylist.click();
    }

    public static void clickPlaylistTextField(String playlistName){
        WebElement playlistTextField = driver.findElement(By.cssSelector("input[name='name']"));
        playlistTextField.clear();
        playlistTextField.sendKeys(playlistName);
        playlistTextField.sendKeys(Keys.RETURN);
    }

    public static void clickAllSongsPage(){
        WebElement clickSongsPage = driver.findElement(By.cssSelector("li>a.songs"));
        clickSongsPage.click();
    }

    public static void rightClickSong(){
        WebElement firstSong = driver.findElement(By.xpath("//td[contains(text(), 'Ketsa - Beautiful')]"));
        Actions actions = new Actions(driver);
        actions.contextClick(firstSong).perform();
    }

    public static void clicksAddTo(){
        WebElement clicksAdd = driver.findElement(By.cssSelector("ul>li.has-sub"));
        Actions actions = new Actions(driver);
        actions.moveToElement(clicksAdd).perform();
    }

    public static void picksPlaylist(){
       WebElement newPlaylist = driver.findElement(By.xpath("//*[@id=\"app\"]/nav/ul/li[4]/ul/li[9]"));
       newPlaylist.click();
    }

    public static void assertionPlaylist(){
        WebElement playlist = driver.findElement(By.xpath("//a[contains(text(), 'New Playlist NL')]"));
        playlist.click();
    }

}