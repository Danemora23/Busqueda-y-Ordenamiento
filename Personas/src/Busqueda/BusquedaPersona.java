package Busqueda;
import java.util.Arrays;
import java.util.Scanner;
import listado.ListadoPersonas;
public class BusquedaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		listado.ListadoPersonas ingre = new ListadoPersonas();
		
		int opcion = 0;
		do {
		System.out.println("1. INGRESAR DATOS");
		System.out.println("2. CONSULTA DE DATOS");
		opcion = ingreso.nextInt();
			
		

		switch (opcion) {
		case 1:
			System.out.println("BIENBENIDO");
			System.out.println("=======================");
		
			System.out.println("Ingrese su DPI: ");
			ingre.setDPI(ingreso.nextInt());
			System.out.println("Ingrese su Nombre: ");
			ingre.setNombre(ingreso.next());
			System.out.println("Ingrese su Edad: ");
			ingre.setEdad(ingreso.nextInt());
			break;
		case 2: 
			System.out.println("BIENBENIDO");
			int lista[] = {ingre.getDPI()};
			
			System.out.println("Array: " + Arrays.toString(lista));
			//ordenamientoSeleccion(lista);
			System.out.println("Array: " + Arrays.toString(lista));
			
			int indiceMenor;
			
			for (int i = 0;i<lista.length; i++) {
				
				indiceMenor = i;
				
				for (int j = i+1; j<lista.length; j++) {
					if (lista[j] < lista[indiceMenor]) {
						indiceMenor = j;
					}		
						
				}
				if (i != indiceMenor) {
					intercambiar(lista, i, indiceMenor);
				}
			}
			
			break;
			
		}
		
		}
		while(opcion !=2);
		
		
		
	}

	static void intercambiar(int[] lista, int i, int j) {
		System.out.println("intercambiar "+lista[i]+" y "+lista[j]);
		int aux = lista[i];
		lista[i] = lista[j];
		lista[j] = aux;
	}



}
