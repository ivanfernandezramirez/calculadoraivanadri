/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraivanadri;

import java.util.Scanner;

public class CalculadoraIvanAdri {

    public static void main (String args[]) {
		Scanner introducir;
		introducir=new Scanner(System.in);
		
		int a,b;
		String op;
		
		System.out.print("Introduce el primer numero: ");
		a=introducir.nextInt();
		
		System.out.print("Introduce el operador: ");
		op=introducir.nextLine(); 
		op=introducir.nextLine(); /* se introduce dos veces para que lo detecte a la hora de 
								    pedirlo por pantalla (return) */

		switch(op){
			case "+":
				System.out.print("Introduce el segundo numero: ");
				b=introducir.nextInt();
				System.out.print("suma= "+(a+b));
				break;
			case "-":
				System.out.print("Introduce el segundo numero: ");
				b=introducir.nextInt();
				System.out.print("resta= "+(a-b));
				break;
			
			case "*":
				System.out.print("Introduce el segundo numero: ");
				b=introducir.nextInt();
				System.out.print("mult= "+(a*b));
				break;
						
			case "/":
				double bb,aa;
				aa= (double)a;
				do{	
				System.out.print("Introduce el segundo numero: ");
				bb=introducir.nextInt();
				if(bb!=0) System.out.print("division= "+(aa/bb)+"\n");
				else System.out.println("Vuelve a introducir");
				}while(bb==0);
				break;
				
			default: System.out.print("Has introducido mal el operador!");
		}
	}  
}
