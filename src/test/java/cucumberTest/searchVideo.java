package cucumberTest;

import activity.MainActivityYoutube;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class searchVideo {
    MainActivityYoutube mainActivityYoutube=new MainActivityYoutube();

    @Test
    public  void findVideo()throws MalformedURLException{
        String videoName="OP Dragon Ball GT";
        mainActivityYoutube.searchButton.click();
        mainActivityYoutube.videoName.type(videoName);
        mainActivityYoutube.findVideo.click();

        String noteMessage="hora";

        Assert.assertEquals("ERROR ! ",noteMessage,videoName);
    }





}
