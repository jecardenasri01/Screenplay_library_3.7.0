package serenityestructura.serenity.home.task;

import serenityestructura.driver.utilidades.Dri_Global;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static serenityestructura.serenity.home.pageobject.PagO_Home.BTN_ENTENDIDO;


public class Pag_Home {

    public static Dri_Global dri_global = new Dri_Global();

    public static Performable CerrarMnesajeHeader() {
        return Task.where("Cerrar mensaje de header",
               // dri_global.Esperar(PagO_Home.BTN_ENTENDIDO),
                dri_global.ClickEn(BTN_ENTENDIDO)

        );
    }

}
