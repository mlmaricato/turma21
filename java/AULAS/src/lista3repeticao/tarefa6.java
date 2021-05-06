package lista3repeticao;

import java.util.Scanner;

public class tarefa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		int numeroTotal = 0;
		int soma = 0;
		double media = 0.0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if((numero%3) == 0 && numero!=0) {
				soma = soma + numero;	
				numeroTotal++;
			}		
			
		} while (numero!=0);
								
		media = soma/numeroTotal;
		System.out.printf("\nA média dos números múltiplos de 3 é: %.2f",media);
		}	

	}

