
import java.io.*;

public class Main {
	public static void main(String[] args) {
		
		
		
		String rutaRaiz="C:\\\\Users\\\\Gonzotp\\\\Desktop\\\\Directorios\\Directorio1";
		crearFichero(rutaRaiz, "fichero5.txt");
		copiarFichero();
		
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
	
		   
	    private static void copiarFichero() { 
	    	
	    	InputStream in = null;
		    OutputStream out = null;
    try {
        File archivoOriginal = new File("C:\\Users\\Gonzotp\\Desktop\\Directorios\\Directorio1\\fichero1.txt");
        File archivoCopia = new File("C:\\Users\\Gonzotp\\Desktop\\Directorios\\Directorio1\\fichero5.txt");
        in = new FileInputStream(archivoOriginal);
        out = new FileOutputStream(archivoCopia);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) > 0) {
            out.write(buffer, 0, length);
        }
        in.close();
        out.close();
        System.out.println("Archivo copiado.");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}


  