import org.testng.annotations.Test;

public class Homework18 extends BaseTest {

    @Test
    public static void playSong() throws InterruptedException {
        login("demo@class.com", "te$t$tudent");

        Thread.sleep(2000);

        doubleClickSong();

        Thread.sleep(2000);

        verifyVisualizer();
    }
}
