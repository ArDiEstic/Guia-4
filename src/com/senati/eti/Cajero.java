package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;
public class Cajero {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    
		    String[] arrCodigo = {"A-123-ABC", "A-456-ADC", "A-789-UTF", "A-777-WWW"};
		    String[] arrContrase�a={ "3241", "1425", "4531", "4573"};
		    String[] arrNombre = {"Josef Caballero", "Davne Valle", "Alex Montes", "Keyla Rosales"};
		    ArrayList<Float> arrSaldo = new ArrayList<Float>(4);
		    arrSaldo.add(1200f);
		    arrSaldo.add(900f);
		    arrSaldo.add(2700f);
		    arrSaldo.add(3500f);
		    
		    int[] arSaldo = {1200, 900, 2700, 3500};
		    
		    System.out.println("---------------------------------");
		    System.out.println("BIENVENIDO(A) A TU BANCA EN L�NEA");
		    System.out.println("---------------------------------");
		    System.out.print("INGRESE N�MERO DE SU TARJETA: ");
		    String codigo = sc.nextLine(); //A-456
		    
		    int pos = -1;
		    
		    for(int x = 0; x < arrCodigo.length; x++) {
		      if (codigo.equals(arrCodigo[x])) {
		        pos = x;
		        break;
		    }
		    }
		      
		    if (pos == -1) {
		      System.out.println("\n----------------------");
		      System.out.println("N�MERO DE TARJETA INVALIDO");
		      System.out.println("------------------------");
		    }
		    else {
		      System.out.println("\n---------------------------------");
		      System.out.println("BIENVENIDO(A) A TU BANCA EN L�NEA");
		      System.out.println("---------------------------------");
		      System.out.println("N�mero de Tarjeta.........: "+ arrCodigo[pos]);
		      
		      
		      
		      
		      System.out.print("INGRESE SU CONTRASE�A DE 4 DIGITOS: ");
		      String Contrase�a = sc.nextLine();
		      
		      int con = -1;
		      
		      for(int x = 0; x < arrContrase�a.length; x++) {
		        if (Contrase�a.equals(arrContrase�a[x])) {
		          con = x;
		          break;
		        }
		          
		        
		      }
		      
		      if (con == -1) {
		        System.out.println("\n---------------------");
		        System.out.println("CONTRASE�A INCORRECTA");
		        System.out.println("-----------------------");
		      }
		      else {
		    	  int op = 0, n_op = 0;
		    	  float nSaldo = 0;
		          String operacion = "", otra = "S";
		        
		          System.out.println("\n---------------------------------");
		          System.out.println("BIENVENIDO(A) "+ arrNombre[pos]);
		          System.out.println("---------------------------------");
		          System.out.println("Numero de Tarjeta.........: "+ arrCodigo[pos]);
		          
		          while(otra.equals("S") || otra.equals("s")) {
		        	  n_op ++;
		        	  System.out.println("\n--------OPERACIONES--------");
			          System.out.println("1. CONSULTA DE SALDO");
			          System.out.println("2. RETIRO");
			          System.out.println("3. TRANSFERENCIAS");
			          System.out.println("4. DEP�SITO");
			          System.out.println("5. ");
			          System.out.print("�Qu� operaci�n desea realizar?: ");
			          op = sc.nextInt();
	
		        	  switch(op) {	
				        case 1:
				        	operacion = "CONSULTA DE PAGOS";
				        	System.out.println("\n------------------------------");
				        	System.out.println("OPERACI�N: " + operacion);
				        	System.out.println("------------------------------");
					        System.out.println("SALDO DISPONIBLE: S/. " + arrSaldo.get(pos));
						    
					        break;
					        
				        case 2:
				    	    operacion = "RETIRO";
				    	    float c2 = 0;
				    	    int num_ret = 0;
				    	    String rp = "S";
				    	    System.out.println("\n------------------------------");
			    	        System.out.println("OPERACI�N: " + operacion);
			    	        System.out.println("------------------------------");
				    	    System.out.print("�Cu�nto desea retirar?: ");
				    	    c2 = sc.nextFloat();
				    	    
				    	    if (c2 <= arrSaldo.get(pos)) {
				    	    	nSaldo = arrSaldo.get(pos) - c2;
				    	    	arrSaldo.remove(pos);
				    	    	arrSaldo.add(pos, nSaldo);
				    	        System.out.println("\nNUEVO SALDO: S/. " + nSaldo);
				    	    }
				    	    else if (c2 > arrSaldo.get(pos))
				    	        System.out.println("NO SE PUEDE REALIZAR LA OPERACI�N");
				    		
				    	    break;
				    	    
				        case 3:
				    	    operacion = "TRANSFERENCIAS";

				    	    int tipo = 0;
				    	    float ct = 0;
				    	    
				    	    System.out.println("\n------------------------------");
				    	    System.out.println("OPERACI�N: " + operacion);
				    	    System.out.println("------------------------------");
				    	    
				    	   
				    	    System.out.print("Cantidad a tranferir: ");
			    	    	ct = sc.nextFloat();
			    	    	sc.nextLine();
			    	    	System.out.print("N�mero de tarjeta a tranferir: ");
			    	    	String nt = sc.nextLine();
				    	   
			    	    	if(ct <= arrSaldo.get(pos)) {
			    	    		nSaldo = arrSaldo.get(pos) - ct;
			    	    	    arrSaldo.remove(pos);
			    	    	    arrSaldo.add(pos, nSaldo);
			    	    	    
			    	    	
			    	    	    System.out.println("\nTARJETA A TRANSFERIR: " + nt);
			    	    	    System.out.println("NUEVO SALDO: S/." + nSaldo);
			    	    	}
				    	    else 
				    	    	System.out.println("\nNO SE PUEDE REALIZAR LA OPERACI�N");
				    	    
				    	    break;
				    	    
				        case 4:
				    	    operacion = "Dep�sito";
				    	    float depo = 0;
				    	    
				    	    System.out.println("�Cu�nto desea depositar?: ");
				    	    depo = sc.nextFloat();
				  
				    	    if(depo == 0)
				    	    	System.out.println("NO SE PUEDE REALIZAR LA OPERACI�N");
				    	    else {
				    	    	nSaldo = depo + arrSaldo.get(pos);
				    	    	arrSaldo.remove(pos);
				    	    	arrSaldo.add(pos, nSaldo);
				    	    	
				    	    	System.out.println("NUEVO SALDO: " + nSaldo);
				    	    }
				    	    
				    	    break;
				    	    
				        case 5:
				        	operacion = "Pago de servicios";
				        	break;
			           }
		        	  
		        	  sc.nextLine();
		        	  
		        	  System.out.print("\n�Desea realizar otra operaci�n<S/N>?: ");
		        	  otra = sc.nextLine();
		        	  
		          }
			      System.out.println("\n------------------------------");
				  System.out.println("TU BANCO TRABAJA LAS 24 HORAS");
				  System.out.println("------------------------------");
		      }
		  
		    }
	     
	}
}
