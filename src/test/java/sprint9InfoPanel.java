import org.testng.annotations.Test;

public class sprint9InfoPanel extends BaseTest {

        @Test
        public static void verifyAlbumNameDisplayedTest(){
            login("nicoleliano1@yahoo.com", "1te$tpa$$word");

            doubleClickSong();
            clickAlbumTabInfoPanel();
            verifyAlbumNameSame();

        }

        @Test
        public static void verifyLyricsAreDisplayedTest(){
            login("nicoleliano1@yahoo.com", "1te$tpa$$word");

            doubleClickSong();
            clickLyricTabInfoPanel();
            verifyLyricsPresent();

        }

        @Test
        public static void verifyArtistNamePresentVisualizerTest(){
            login("nicoleliano1@yahoo.com", "1te$tpa$$word");

            doubleClickSong();
            verifyArtistNamePresent();
        }

        @Test
        public static void verifyInfoPanelWorksTest() throws InterruptedException {
            login("nicoleliano1@yahoo.com", "1te$tpa$$word");

            Thread.sleep(2000);

            clickInfoPanelButtonTest();

        }

        @Test
        public static void verifyShuffleButtonInfoPanelTest() {
            login("nicoleliano1@yahoo.com", "1te$tpa$$word");

            doubleClickSong();
            clickAlbumTabInfoPanel();
            clickShuffleButtonInfoPanel();

        }

    }

