package exemplos;

import java.util.Scanner;

public class exemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis 
		int numero = 233;
		
		do {
			if (numero >= 300 && numero <=400){
				System.out.printf("\n%d + 3 = %d",numero, (numero = numero + 3));
				numero = numero +3;
				
			}
				
			if (numero >=233 && numero <300 || numero >400 && numero < 456) {
				System.out.printf("\n%d + 5 = %d",numero, (numero = numero + 5));
				numero = numero +3;
			}
				
				
			} while(numero >= 233 && numero <456);
			
			if (numero <233 || numero >456){
				System.out.println("\nO numero inserido nao esta entre 233 a 456");
			}
			
	
			}
		}



