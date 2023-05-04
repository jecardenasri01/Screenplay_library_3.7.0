package serenityestructura.serenity.ejemplo.pageobject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagO_Google {
    //login
    public  static final Target INP_BUSQUEDA = Target.the("save icon").located(By.xpath("//*[@name='q']"));
}
