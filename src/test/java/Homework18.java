import org.testng.annotations.Test;

public class Homework18 extends BaseTest {

    @Test
    public static void playSong() throws InterruptedException {
        login("nicoleliano1@yahoo.com", "1te$tpa$$word");

        Thread.sleep(2000);

        doubleClickSong();

        Thread.sleep(2000);

        verifyVisualizer();
    }
}
