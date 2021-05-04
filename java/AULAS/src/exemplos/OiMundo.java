package exemplos;

import java.util.Scanner;

public class OiMundo {
	
	public static void main(String[] args) {
		
		//VARIAVEIS
		//inteiro numero1
		
		
		//instaciar = criar um teclado
		Scanner leia = new Scanner (System.in);
		
		String nome; //cadeia
		int numero1 = 10;
		int numero2 = 30;
		double salario;
		char op = 'S';
		
		//escreva
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite um numero 1: ");
		//leia(numero)
		numero1 = leia.nextInt();
		System.out.println("Digite um numero 2: ");
		numero2 = leia.nextInt();
		System.out.println("Digite seu salário: ");
		salario = leia.nextDouble();
				
		System.out.println("Nome: "+nome);
		System.out.println("A soma é: "+(numero1+numero2));
		System.out.println("Seu salário é "+salario);
		
		
	}

}
