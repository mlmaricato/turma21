package lista3repeticao;

import java.util.Scanner;

public class tarefa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			
			soma = soma + numero;
					
		} while (numero != 0);
		
		System.out.printf("\nA somat�ria dos n�meros digitados �: %d",soma);		

	}

}
