package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		String[] [] datos = {{"Arian Espinoza", "Carol Mora", "Ricardo Vásquez"},
				             {"Comas", "Callao", "Puente Piedra"}};
		// datos.length -> Cantidad de filas de la matriz
		// datos[o].length-> Cantidad de elemtos del arreglos de la 1era fila (columnas)
		
		// Impresion de valores de la matriz por filas
		System.out.println("________________IMPRESIÓN POR FILAS________________");
		System.out.println("===================================================");
		for(int f = 0; f < datos.length; f++) {
			for(int c = 0; c < datos[0].length;c++) 
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
			
		}
		
		System.out.println();
		
		// Impresión de valor de la matriz por columnas
		System.out.println("________________IMPRESIÓN POR COLUMNAS________________");
		System.out.println("======================================================");
		for(int c = 0; c < datos[0].length; c++) {
			for(int f = 0; f < datos.length;f++) 
				System.out.print(String.format("%-20s", datos[f][c]) + "\t");
			
			System.out.println();
			
		}

	}

}
