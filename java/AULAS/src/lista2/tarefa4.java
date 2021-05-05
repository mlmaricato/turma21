package lista2;

import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		double numero = 0.0;
		double numeroFinal = 0.0;
		
		//entrada
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		
		//processamento
		if ((numero%2) == 0) {
			numeroFinal = Math.sqrt(numero);	
			
		}
		else if ((numero%2) != 0) {
			numeroFinal = Math.pow((numero), 2);
			
		}
		//saida
		
		System.out.printf("O número final é: %.2f",numeroFinal);
		
		
		/*
		 * System.out.println(((valor%2)==0) ? "NUMERO PAR": "NUMERO IMPAR");
		 * System.out.println((valor==0)? "ZERO É NEUTRO":((valor%2)==0) ? "NUMERO PAR": "NUMERO IMPAR");

		 */
		

	}

}
