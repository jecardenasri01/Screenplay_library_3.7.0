package serenityestructura.driver.navegador;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class Dri_AbrirNavegador {

    public static Performable HomeProvidaTst() {
        return Task.where("{0} abrir pagina youtube",
                Open.browserOn().the(Dri_Tst.class));
    }

    public static Performable HomeGoogle() {
        return Task.where("{0} abrir pagina youtube",
                Open.browserOn().the(Dri_Google.class));
    }
}
