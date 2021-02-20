package Busqueda;

import java.util.Arrays;
import java.util.Scanner;

import listado.ListadoPersonas;

public class Busquedaseleccion {
	
	
	//Scanner ingreso = new Scanner(System.in);
	listado.ListadoPersonas ingre = new ListadoPersonas();
	int lista[] = {ingre.getDPI()};

	
	//System.out.println("Seleccion: " + Arrays.toString(lista));
	//ordenseleccion(lista);
	//System.out.println("Seleccion: " + Arrays.toString(lista));
	

		
	public static void ordenseleccion(int a[]) {
		int seleccion;
		
		for(int i = 0; i<a.length; i++) {
			seleccion = i;
			for(int j =i+1; j<a.length;j++) {
				if (a[j]<a[seleccion]) {
					seleccion = j;
				}
			}
			if (i != seleccion) {
				intercambiar(a,i,seleccion);
			}
			
		}
		
	}

	static void intercambiar(int[] lista, int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Cambiar: " + lista[i]+ "y" +lista[j]);
		int aux = lista[i];
		lista[i] = lista[j];
		lista[j] = aux;
		
	}

}
