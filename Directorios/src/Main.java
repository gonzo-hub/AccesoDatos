import java.io.File;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		String rutaRaiz="C:\\Users\\Gonzotp\\Desktop\\Directorios";
		crearDirectorio(rutaRaiz, "Directorio1");
		crearDirectorio(rutaRaiz, "Directorio2");
		
		crearFichero(rutaRaiz, "fichero3.txt");
		
		String subRuta="C:\\\\Users\\\\Gonzotp\\\\Desktop\\\\Directorios\\Directorio1";
		crearFichero(subRuta, "fichero1.txt");
		crearFichero(subRuta, "fichero2.txt");

		subRuta="C:\\\\Users\\\\Gonzotp\\\\Desktop\\\\Directorios\\Directorio2";
		crearFichero(subRuta, "fichero1.txt");

	}

	private static boolean crearDirectorio(String ruta, String nombre) {
		boolean todoOK=false;
		try {
			File f = new File(ruta, nombre);
			if(!f.exists()) {
					f.mkdir();
			}
			else {
				System.out.printf("El directorio '%s' ya existe. Se omite su creación\n",nombre);
			}
			todoOK=true;;
		} catch (Exception ex) {
			System.out.printf("Ha ocurrido un error al crear el directorio '%s' en la ruta '%s'\n", nombre, ruta);
		}
		return todoOK;
	}
	
	private static boolean crearFichero(String ruta, String nombre) {
		boolean todoOK=false;
		try {
			File f = new File(ruta, nombre);
			if(!f.exists()) {
					if(!f.createNewFile()) {
						System.out.printf("No se ha podido crear el fichero '%s' en la ruta '%s'\n", nombre, ruta);
					}
			}
			else {
				System.out.printf("El fichero '%s' ya existe. Se omite su creación\n",nombre);
			}
			todoOK=true;;
		} catch (Exception ex) {
			System.out.printf("Ha ocurrido un error al crear el fichero '%s' en la ruta '%s'\n", nombre, ruta);
		}
		return todoOK;
	}
}
