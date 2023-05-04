package serenityestructura.driver.utilidades;

import java.io.File;

public class Dri_Evidencia {
    public static void EliminarCarpeta(String rutaCarpeta) {

        File file = new File(rutaCarpeta);
        deleteFolder(file);

    }
    public static void deleteFolder(File file){
        for (File subFile : file.listFiles()) {
            if(subFile.isDirectory()) {
                deleteFolder(subFile);
            } else {
                subFile.delete();
            }
        }
        file.delete();
    }
}
