package serenityestructura.serenity.ejemplo.task;


import serenityestructura.driver.utilidades.Dri_Global;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static serenityestructura.serenity.ejemplo.pageobject.PagO_Google.INP_BUSQUEDA;

public class Pag_InicioGoogle {
    public static Performable busquedaCancionesGoogle(String cancion) {
        Dri_Global driglobal = new Dri_Global();
        return Task.where("Busqueda canción en google",
                driglobal.Escribir(cancion, INP_BUSQUEDA),
             //   Enter.theValue(cancion).into(INP_BUSQUEDA),
                Hit.the(Keys.ENTER).into(INP_BUSQUEDA)
        );
    }
}
