package com.senati.eti;

import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int np = 0, ni = 0; 
        float suma = 0;
        
		for(int x = 0; x < numeros.length; x++) {
			System.out.print("Ingrese número " + (x + 1) + ": ");
			numeros[x] = sc.nextInt();
			
			suma = suma + numeros[x];
			
			if(x % 2 == 0)
				ni++;
			else
				np++;
				
		}
		float pro = suma / numeros.length;
		
		System.out.println("\n========== RESULTADOS ==========");
		System.out.println("Cantidad de números pares....: " + np);
		System.out.println("Cantidad de números impares..: " + ni);
		System.out.println("Promedio de los números......: " + pro);

	}

}
