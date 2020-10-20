package activity;

 import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

import javax.xml.soap.Text;

public class MainActivityYoutube {
    public Button searchButton;
    public TextBox videoName;
    public Button findVideo;
    public Text resultFind;

    public MainActivityYoutube(){
        searchButton=new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Buscar\"]"));
        videoName=new TextBox(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText"));
        findVideo=new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout"));
        //resultFind=new Text(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView"));

    }

}
