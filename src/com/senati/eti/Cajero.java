package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;
public class Cajero {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    
		    String[] arrCodigo = {"A-123-ABC", "A-456-ADC", "A-789-UTF", "A-777-WWW"};
		    String[] arrContraseña={ "3241", "1425", "4531", "4573"};
		    String[] arrNombre = {"Josef Caballero", "Davne Valle", "Alex Montes", "Keyla Rosales"};
		    ArrayList<Float> arrSaldo = new ArrayList<Float>(4);
		    arrSaldo.add(1200f);
		    arrSaldo.add(900f);
		    arrSaldo.add(2700f);
		    arrSaldo.add(3500f);
		    
		    int[] arSaldo = {1200, 900, 2700, 3500};
		    
		    System.out.println("---------------------------------");
		    System.out.println("BIENVENIDO(A) A TU BANCA EN LÍNEA");
		    System.out.println("---------------------------------");
		    System.out.print("INGRESE NÚMERO DE SU TARJETA: ");
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
		      System.out.println("NÚMERO DE TARJETA INVALIDO");
		      System.out.println("------------------------");
		    }
		    else {
		      System.out.println("\n---------------------------------");
		      System.out.println("BIENVENIDO(A) A TU BANCA EN LÍNEA");
		      System.out.println("---------------------------------");
		      System.out.println("Número de Tarjeta.........: "+ arrCodigo[pos]);
		      
		      
		      
		      
		      System.out.print("INGRESE SU CONTRASEÑA DE 4 DIGITOS: ");
		      String Contraseña = sc.nextLine();
		      
		      int con = -1;
		      
		      for(int x = 0; x < arrContraseña.length; x++) {
		        if (Contraseña.equals(arrContraseña[x])) {
		          con = x;
		          break;
		        }
		          
		        
		      }
		      
		      if (con == -1) {
		        System.out.println("\n---------------------");
		        System.out.println("CONTRASEÑA INCORRECTA");
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
			          System.out.println("4. DEPÓSITO");
			          System.out.println("5. ");
			          System.out.print("¿Qué operación desea realizar?: ");
			          op = sc.nextInt();
	
		        	  switch(op) {	
				        case 1:
				        	operacion = "CONSULTA DE PAGOS";
				        	System.out.println("\n------------------------------");
				        	System.out.println("OPERACIÓN: " + operacion);
				        	System.out.println("------------------------------");
					        System.out.println("SALDO DISPONIBLE: S/. " + arrSaldo.get(pos));
						    
					        break;
					        
				        case 2:
				    	    operacion = "RETIRO";
				    	    float c2 = 0;
				    	    int num_ret = 0;
				    	    String rp = "S";
				    	    System.out.println("\n------------------------------");
			    	        System.out.println("OPERACIÓN: " + operacion);
			    	        System.out.println("------------------------------");
				    	    System.out.print("¿Cuánto desea retirar?: ");
				    	    c2 = sc.nextFloat();
				    	    
				    	    if (c2 <= arrSaldo.get(pos)) {
				    	    	nSaldo = arrSaldo.get(pos) - c2;
				    	    	arrSaldo.remove(pos);
				    	    	arrSaldo.add(pos, nSaldo);
				    	        System.out.println("\nNUEVO SALDO: S/. " + nSaldo);
				    	    }
				    	    else if (c2 > arrSaldo.get(pos))
				    	        System.out.println("NO SE PUEDE REALIZAR LA OPERACIÓN");
				    		
				    	    break;
				    	    
				        case 3:
				    	    operacion = "TRANSFERENCIAS";

				    	    int tipo = 0;
				    	    float ct = 0;
				    	    
				    	    System.out.println("\n------------------------------");
				    	    System.out.println("OPERACIÓN: " + operacion);
				    	    System.out.println("------------------------------");
				    	    
				    	   
				    	    System.out.print("Cantidad a tranferir: ");
			    	    	ct = sc.nextFloat();
			    	    	sc.nextLine();
			    	    	System.out.print("Número de tarjeta a tranferir: ");
			    	    	String nt = sc.nextLine();
				    	   
			    	    	if(ct <= arrSaldo.get(pos)) {
			    	    		nSaldo = arrSaldo.get(pos) - ct;
			    	    	    arrSaldo.remove(pos);
			    	    	    arrSaldo.add(pos, nSaldo);
			    	    	    
			    	    	
			    	    	    System.out.println("\nTARJETA A TRANSFERIR: " + nt);
			    	    	    System.out.println("NUEVO SALDO: S/." + nSaldo);
			    	    	}
				    	    else 
				    	    	System.out.println("\nNO SE PUEDE REALIZAR LA OPERACIÓN");
				    	    
				    	    break;
				    	    
				        case 4:
				    	    operacion = "Depósito";
				    	    float depo = 0;
				    	    
				    	    System.out.println("¿Cuánto desea depositar?: ");
				    	    depo = sc.nextFloat();
				  
				    	    if(depo == 0)
				    	    	System.out.println("NO SE PUEDE REALIZAR LA OPERACIÓN");
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
		        	  
		        	  System.out.print("\n¿Desea realizar otra operación<S/N>?: ");
		        	  otra = sc.nextLine();
		        	  
		          }
			      System.out.println("\n------------------------------");
				  System.out.println("TU BANCO TRABAJA LAS 24 HORAS");
				  System.out.println("------------------------------");
		      }
		  
		    }
	     
	}
}
