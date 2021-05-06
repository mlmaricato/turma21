package lista3repeticao;

import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		final int NUMEROVEZES = 10;
		double vezesPares = 0.0;
		double vezesImpar = 0.0;
		double numero = 0.0;
		double neutro = 0.0;

		
		
		for (int x=0; x<NUMEROVEZES; x++) {
			
			System.out.printf("Digite um numero ",NUMEROVEZES);
			numero = leia.nextDouble();
		
			
			if((numero%2) == 0 && numero!=0) {
				vezesPares++;
				
			}
			
			else if((numero%2) != 0 && numero!=0) {
				vezesImpar++;
			
			}
		}
		
		System.out.printf("\nForam digitados %.0f números pares",vezesPares);
		System.out.printf("\nForam digitados %.0f números ímpares",vezesImpar);
		
		}
						
	}

	

