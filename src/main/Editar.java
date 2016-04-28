package main;

import java.io.*;
import java.util.*;

public class Editar {
	Scanner sc = new Scanner(System.in);
	String textoAgragado = sc.nextLine();
	
	public void Agregar(){
		System.out.println("\n"+"El formato para añadir un libro es el siguiente"+"\n"+"Primero de el nombre y despues el autor"+"\n"+"Despues el nombre del autor");
		try(FileWriter fw = new FileWriter("DB.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println(textoAgragado);
			    out.close();
			} catch (Exception e) {
			    System.out.println("Error al escribir el archivo");
			}
	}
	
	public void Eliminar(){
		
	}
}
