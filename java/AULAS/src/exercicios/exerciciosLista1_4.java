package exercicios;

import java.util.Scanner;

public class exerciciosLista1_4 {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		int numeroA = 0;
		int numeroB = 0;
		int numeroC = 0;
		double valorR = 0.0;
		double valorS = 0.0;
		double valorD = 0.0;
		
		//entrada
		System.out.println("Digite um número para o valor A: ");
		numeroA = leia.nextInt();
		System.out.println("\"Digite um número para o valor B: ");
		numeroB = leia.nextInt();
		System.out.println("Digite um número para o valor C: ");
		numeroC = leia.nextInt();
		
		//processamento
		valorR = Math.pow((numeroA + numeroB), 2);
		valorS = Math.pow((numeroB + numeroC), 2);
		valorD = (valorR + valorS) / 2;
		
		//saida
		System.out.println("O valor de R é: "+valorR);
		System.out.println("O valor de S é: "+valorS);
		System.out.println("O valor de D é: "+valorD);
		
		
	}

}
