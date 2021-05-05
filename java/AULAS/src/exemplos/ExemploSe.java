package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
				
		/*
		 * se o numero for 0 = zero é neutro
		 * se o numero for par escreve par
		 * se for impar escrever impar
		 * se for negativo escreve numero negativo
		 * 
		 * se ((numero%2)==0){
		 * escreva ("Numero par")
		 * }
		 */
		
		if (numero==0){
			System.out.println("Zero é neutro");
		}
		else if (numero<0) {
			System.out.println("Menor que zero é negativo");		
		}
		
		else if ((numero%2)==0) {
			System.out.println("O número é par!!");		
		}
		else {
			System.out.println("O número é ímpar");
		}
		

	}

}
