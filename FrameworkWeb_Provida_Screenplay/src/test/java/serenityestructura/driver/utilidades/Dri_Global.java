package serenityestructura.driver.utilidades;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import net.serenitybdd.screenplay.targets.ByTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;



public  class Dri_Global {


    @Step("Hacer clic en {1}")
    public Performable ClickEn(Target elemento) {
     //   Performable esperar = Esperar(elemento);
  //      ResaltarElemento(elemento,"g");
        return Click.on(elemento);
    }
/*    @Step("{0} verificar si un elemento existe")
    public Performable Esperar(Target elementos) {

        return Wait.until(
                WebElementQuestion.the(elementos), WebElementStateMatchers.isEnabled()
        ).forNoLongerThan(30).seconds();


    }
*/
    @Step("Ingresar el valor {0} en {2}")
    public  Performable Escribir(String texto, Target elemento) {
      //  String xpath =((By.ByXPath) ((ByTarget) elemento).getLocator()).getRemoteParameters().value().toString();

      //  ResaltarElemento(elemento,"g");
        return Enter.theValue(texto).into(elemento);
    }

    @Step("{0} verificar si un elemento existe")
    public Boolean answeredBy(Target elemento, Actor actor) {
        Boolean elementorevisar = elemento.resolveFor(actor).isDisplayed();
       // Serenity.recordReportData().withTitle("verificar si existe elemento "+elemento.toString()).andContents(elementorevisar.toString());

        return elementorevisar;
    }

/*

    public Performable ResaltarElemento(Target elemento, String color) {
      JavascriptExecutor js = (JavascriptExecutor) Serenity.getDriver();


        String xpath =((By.ByXPath) ((ByTarget) elemento).getLocator()).getRemoteParameters().value().toString();


        if (color == "g") {
            js.executeScript("arguments[0].style.border = '5px solid red'", Serenity.getDriver().findElement(By.xpath(xpath)));
        } else {
            js.executeScript("arguments[0].style.border = '5px solid black'", Serenity.getDriver().findElement(By.xpath(xpath)));

        }



        return null;


    }

 */


}
