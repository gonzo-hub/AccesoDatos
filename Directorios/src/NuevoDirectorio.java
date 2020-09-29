
import java.io.File;

public class NuevoDirectorio {
	
	public static void crearDirectorio (String ruta, String nombre) {
	
			File Directorio1 = new File ("C:\\Users\\Gonzotp\\Desktop\\Directorios");
			
			if(!Directorio1.exists()) {
				
				Directorio1.mkdir();
				
				System.out.println("Se ha creado el directorio");
			}else {
				System.out.println("El directorio " + nombre + " no existe");
			}

	}
	
	public static void crearFichero(String ruta, String fichero) {
		
		File fichero1 = new File ("C:\\Users\\Gonzotp\\Desktop\\Directorios\\Directorio1");
		
	if(!fichero1.exists()) {
		
		fichero1.mkdir();
		
		System.out.println("Se ha creado el fichero");
	}else {
		System.out.println("El fichero " + fichero + " no existe");
	}

}

	
}