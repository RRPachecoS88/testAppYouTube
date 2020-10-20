package runner;

import activity.MainActivityYoutube;
import io.appium.java_client.ScreenshotState;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;
import java.net.MalformedURLException;

public class MyStepdefs {
    MainActivityYoutube mainActivityYoutube=new MainActivityYoutube();
    @Given("Tengo la appYoutube abierta")
    public void tengoLaAppYoutubeAbrierta() {

    }

    @When("Hago click en el Boton [Buscar]")
    public void hagoClickEnElBotonBuscar() throws MalformedURLException {
        mainActivityYoutube.searchButton.click();
    }

    @And("Se escribe el {string} del video en el [Texbox]")
    public void seEscribeElNombreDelVideoEnElTexbox(String nombreVideo) throws MalformedURLException {
        mainActivityYoutube.videoName.type(nombreVideo);
    }

    @And("Se hace click [finVideo] para buscar")
    public void hgoClickFinVideoParaBuscar() throws MalformedURLException{
        mainActivityYoutube.findVideo.click();
    }

    @Then("Se muestra los resultados")
    public void seMuestraLosResultados() {



    }
}
