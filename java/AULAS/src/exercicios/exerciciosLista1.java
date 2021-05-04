package exercicios;

import java.util.Scanner;

public class exerciciosLista1 {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		double media = 0.0;
		final double peso2 = 2.0;
		final double peso3 = 3.0;
		final double peso5 = 5.0;
		double soma = 0.0;
		
		//entradas
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextDouble();
		
		//processamento
		soma = (nota1+nota2+nota3);
		media = ((nota1 * peso2) + (nota2 * peso3) + (nota3 * peso5)) / (peso2 + peso3 + peso5);
		
		//saida
		System.out.println("A somatória das notas é "+(soma));
		System.out.println("A média ponderada é: "+(media));		
		
	}

}
