package main;

import java.io.BufferedReader;
import java.io.FileReader;

public class Leer {

	public void LeerArchivo(String string) {
		try(BufferedReader br = new BufferedReader(new FileReader(string))) {
		    StringBuilder sb = new StringBuilder();
		    String linea = br.readLine();
		    boolean verif = false;

		    while (linea != null) {
		        sb.append(linea);
		        sb.append(System.lineSeparator());
		        linea = br.readLine();
		        verif = true;
		    }
		    
		    if(linea == null || verif == false){
		    	System.out.println("Actualmente no existen datos guardados");
		    }
		    
		    String todo = sb.toString();
		    System.out.println(todo);
		} catch (Exception e) {
			System.out.println("Error archivo no encontrado"+"\n"+"Creando archivo");
			Crear crear = new Crear();
			crear.CrearArchivo();
			LeerArchivo("DB.txt");
		} 
	}

}
