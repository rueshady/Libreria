package main;

import java.util.*;

public class VerificadorCaso {
	boolean execute = true;
	boolean antifail= true;
	Scanner sc = new Scanner(System.in);
	public void verificar(){
		System.out.println("Bienvenido al inventario fictisio de la libreria imaginaria" + "\n"+"De la funcion a ejecutar"+"\n"+"Precione 1 para desplegar el inventario guardado"+"\n"+"Precione 2 para agregar datos"+"\n"+"Precione 3 para elimiar del inventario"+"\n"+"Precione 0 para salir");
		Scanner sc = new Scanner(System.in);
			try{
				int a1 = sc.nextInt();
				while (execute) {
					while (true) {
						if (a1 == 1 || a1 == 2 || a1 == 3 || a1==0) {
						break;
						}else{
							System.out.println("Seleccione una funcion valida"+"\n"+"Precione 1 para desplegar el inventario guardado"+"\n"+"Precione 2 para agregar al inventario"+"\n"+"Precione 3 para elimiar del inventario"+"\n"+"Precione 0 para salir");
							a1 = sc.nextInt();
						}
					}
				switch (a1) {
					
					case 1:
						System.out.println("Desplegando datos atuales");
						Leer leer = new Leer();
						leer.LeerArchivo("DB.txt");
						System.out.println("Funcion realizada"+"\n"+"Precione 1 para desplegar el inventario guardado"+"\n"+"Precione 2 para agregar al inventario"+"\n"+"Precione 3 para elimiar del inventario"+"\n"+"Precione 0 para salir");							
						Reverificar();
					break;
							
					case 2:
						System.out.println("Agregando datos");
						Editar editar = new Editar();
						editar.Agregar();
						System.out.println("Funcion realizada"+"\n"+"Precione 1 para desplegar el inventario guardado"+"\n"+"Precione 2 para agregar al inventario"+"\n"+"Precione 3 para elimiar del inventario"+"\n"+"Precione 0 para salir");							
						Reverificar();
					break;
							
					case 3:
						System.out.println("Seleccione datos a eliminar");
						//eliminar
						System.out.println("Funcion realizada"+"\n"+"Precione 1 para desplegar el inventario guardado"+"\n"+"Precione 2 para agregar al inventario"+"\n"+"Precione 3 para elimiar del inventario"+"\n"+"Precione 0 para salir");							
						Reverificar();
					break;
							
					case 0:
						System.out.println("Cerrando");
						execute = false;
					break;
				}
		sc.close();
					}
			}catch(Exception e){
				System.out.println("Error inesperado intente de nuevo");
			}
	}
	public void Reverificar(){
		Scanner sc = new Scanner(System.in);
		try{
			int a1 = sc.nextInt();
			while (execute) {
				while (true) {
					if (a1 == 1 || a1 == 2 || a1 == 3 || a1==0) {
					break;
					}else{
						System.out.println("Seleccione una funcion valida"+"\n"+"Precione 1 para desplegar el inventario guardado"+"\n"+"Precione 2 para agregar al inventario"+"\n"+"Precione 3 para elimiar del inventario"+"\n"+"Precione 0 para salir");
						a1 = sc.nextInt();
					}
				}
			switch (a1) {
				
				case 1:
					System.out.println("Desplegando datos atuales");
					Leer leer = new Leer();
					leer.LeerArchivo("DB.txt");
					System.out.println("Funcion realizada"+"\n"+"Precione 1 para desplegar el inventario guardado"+"\n"+"Precione 2 para agregar al inventario"+"\n"+"Precione 3 para elimiar del inventario"+"\n"+"Precione 0 para salir");							
					verificar();
				break;
						
				case 2:
					System.out.println("Agregando datos");
					Editar editar = new Editar();
					editar.Agregar();
					System.out.println("Funcion realizada"+"\n"+"Precione 1 para desplegar el inventario guardado"+"\n"+"Precione 2 para agregar al inventario"+"\n"+"Precione 3 para elimiar del inventario"+"\n"+"Precione 0 para salir");							
					verificar();
				break;
						
				case 3:
					System.out.println("Seleccione datos a eliminar");
					//eliminar
					System.out.println("Funcion realizada"+"\n"+"Precione 1 para desplegar el inventario guardado"+"\n"+"Precione 2 para agregar al inventario"+"\n"+"Precione 3 para elimiar del inventario"+"\n"+"Precione 0 para salir");							
					verificar();
				break;
						
				case 0:
					System.out.println("Cerrando");
					execute = false;
				break;
			}
	sc.close();
				}
		}catch(Exception e){
			System.out.println("Error inesperado intente de nuevo");
		}
	}
}
