/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraivanadri;

import java.util.Scanner;
import java.lang.Math;
public class CalculadoraIvanAdri {

    public static void main (String args[]) {
		Scanner introducir;
		introducir=new Scanner(System.in);
		
	int a, b, op, cont, resul;
	
		System.out.println("Elige una de las opciones:");
		System.out.println("1 - Suma:");
		System.out.println("2 - Resta:");
		System.out.println("3 - Multiplicación:");
		System.out.println("4 - División:");
		System.out.println("5 - Raíz cuadrada:");
		System.out.println("6 - Elevar a la potencia:");
		
		op=introducir.nextInt();
	
		switch(op){
			case 1:
				System.out.print("Introduce el primer numero: ");
				a=introducir.nextInt();
				System.out.print("Introduce el segundo numero: ");
				b=introducir.nextInt();
				System.out.print("suma= "+(a+b));
				break;
			case 2:
				System.out.print("Introduce el primer numero: ");
				a=introducir.nextInt();
				System.out.print("Introduce el segundo numero: ");
				b=introducir.nextInt();
				System.out.print("resta= "+(a-b));
				break;
			
			case 3:
				System.out.print("Introduce el primer numero: ");
				a=introducir.nextInt();
				System.out.print("Introduce el segundo numero: ");
				b=introducir.nextInt();
				System.out.print("mult= "+(a*b));
				break;
						
			case 4:
				System.out.print("Introduce el primer numero: ");
				a=introducir.nextInt();
				double bb,aa;
				aa= (double)a;
				do{	
				System.out.print("Introduce el segundo numero: ");
				bb=introducir.nextInt();
				if(bb!=0) System.out.print("division= "+(aa/bb)+"\n");
				else System.out.println("Vuelve a introducir");
				}while(bb==0);
				break;
			
			case 5:
				System.out.print("Introduce el primer numero: ");
				a=introducir.nextInt();
				
				System.out.print("raiz= "+(Math.sqrt(a)));
				break;
			
			case 6:
				cont=0;
				resul=1;
				System.out.print("Introduce el primer numero: ");
				a=introducir.nextInt();
				System.out.print("Introduce el segundo numero: ");
				b=introducir.nextInt();
				while (cont<b){
					resul= resul*a;
					cont++;
				}
				System.out.print("El número es "+resul);
				break;
				
			default: System.out.print("Has introducido mal el operador!");
		}
	}  
}
