import org.testng.annotations.Test;

public class internship extends BaseTest {

    @Test
    public static void verifyAlbumNameDisplayedTest(){
        login("nicoleliano1@yahoo.com", "1te$tpa$$word");

        doubleClickSong();
        clickAlbumTabInfoPanel();
        
    }

}
