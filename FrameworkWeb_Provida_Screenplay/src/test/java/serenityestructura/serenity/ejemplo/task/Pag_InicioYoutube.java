package serenityestructura.serenity.ejemplo.task;


import serenityestructura.serenity.ejemplo.pageobject.PagO_inicioYoutube;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Pag_InicioYoutube {
    public static Performable busquedaCanciones() {
        return Task.where("Busqueda canción en youtube",
                Enter.theValue("hey jude").into(PagO_inicioYoutube.inp_barrabusqueda),
                Click.on(PagO_inicioYoutube.btn_buscarvideo)
        );
    }
}
