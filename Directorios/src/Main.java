import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ruta ="C:\\Users\\Gonzotp\\Desktop\\Directorios";

		
		
		NuevoDirectorio.crearDirectorio(ruta,"Directorio1"); 
		NuevoDirectorio.crearDirectorio(ruta,"Directorio2");
		
		
		File Directorio1 = new File("C:\\Users\\Gonzotp\\Desktopp\\Directorios");
		
		Directorio1.mkdir();
		
		File Directorio2 = new File("C:\\Users\\Gonzotp\\Desktop\\Directorios");
				
		Directorio2.mkdir();
	
		String ruta1 ="C:\\Users\\Gonzotp\\Desktop\\Directorios\\Directorio1";
		
		NuevoDirectorio.crearFichero(ruta1,"Fichero1");
		NuevoDirectorio.crearFichero(ruta1,"Fichero2");
		
	}
}