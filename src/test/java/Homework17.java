import org.testng.annotations.Test;

public class Homework17 extends BaseTest {

    @Test
    public static void addSongToPlaylistTest() throws InterruptedException {
        navigateToPage();

        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();

        Thread.sleep(2000);
        addNewPlaylistButton();
        clickNewPlaylist();
        clickPlaylistTextField("New Playlist NL");
        Thread.sleep(2000);

        clickAllSongsPage();
        Thread.sleep(2000);

        rightClickSong();
        clicksAddTo();
        Thread.sleep(2000);
        picksPlaylist();

        assertionPlaylist();

    }

}
