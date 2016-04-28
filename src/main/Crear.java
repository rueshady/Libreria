package main;

import java.io.*;

public class Crear {

	public void CrearArchivo() {
	       try {
		       BufferedWriter output = null;
	            File file = new File("DB.txt");
	            output = new BufferedWriter(new FileWriter(file));
	            output.close();
	        } catch ( IOException e ) {
	            System.out.println("Error al crear el archivo");
	        }
	}

}
