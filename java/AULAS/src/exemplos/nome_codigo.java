package exemplos;

import java.util.Scanner;

public class nome_codigo {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		String nome = "";
		int anoNascimento = 0;
		int idade = 0;
		char c; 
		final int anoAtual = 2021;
		
		//entrada
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.println("Digite seu gen�ro: M - Masculino; F- Feminino; O - outro ");
		c = leia.next().charAt(0);
		
		//processamento
		idade = anoAtual - anoNascimento;
		
		//saida
		//System.out.println("Nome: "+nome);
		//System.out.println("Idade: "+idade+" anos");
		//System.out.println("Gen�ro: "+c);
		
	
		System.out.printf("Nome: %s\n idade: %d\n gen�ro: %s", nome,idade, c);
			
		
	}
}
		
