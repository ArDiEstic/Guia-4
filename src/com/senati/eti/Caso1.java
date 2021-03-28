package com.senati.eti;

public class Caso1 {

	public static void main(String[] args) {
		// Declarar el arreglo 
		String [] nombre = new String[4];
		
		// Asignar los valores
		nombre[0] = "Joe Castillo";
		nombre[1] = "Carol Mora";
		nombre[2] = "Ricardo Vásquez";
		nombre[3] = "Rosa Martínez";
		
		for (int x = 0; x < nombre.length; x++)
			System.out.println("Nombre " + (x + 1) + ": " + nombre[x]);

	}

}
