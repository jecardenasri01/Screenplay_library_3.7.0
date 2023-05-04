package stepdefinitions;

import serenityestructura.driver.navegador.Dri_AbrirNavegador;
import serenityestructura.serenity.ejemplo.task.Pag_InicioGoogle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class steps_busquedagoogle {
    @Managed(driver = "edge")
    WebDriver chromeDriver;

    @Given("^usuario realiza busqueda en navegador google de (.*)$")
    public void usuario_realiza_busqueda_en_navegador_google_de(String cancionbuscada) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("jeisson").attemptsTo(Dri_AbrirNavegador.HomeGoogle());
        theActorInTheSpotlight().attemptsTo(Pag_InicioGoogle.busquedaCancionesGoogle(cancionbuscada));
        //  theActorCalled("jeisson").attemptsTo(Pag_Login.LoginAmbienteTst(rut,password));

    }
    @When("^accede a youtube")
    public void accede_a_la_seccion_de_certificados_y_ve_los_filtros_de_necesidades() {
    }
    @Then("^revisa nombre de cancion sea (.*)$")
    public void revisa_nombre_de_cancion_sea (String cancionencontrada) {
    }

}
