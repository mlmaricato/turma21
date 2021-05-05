package lista2;

import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int posicao1 = 0;
		int posicao2 = 0;
		int posicao3 = 0;
		
		//entrada
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		//processamento
		
		if (numero1<numero2 && numero1<numero3) {
			posicao1 = numero1;		
		}
		else if (numero2<numero1 && numero2<numero3) {
			posicao1 = numero2;			
		}
		else if (numero3<numero1 && numero3<numero2) {
			posicao1 = numero3;
		}
		
		
		if (numero1>numero2 && numero1<numero3) {
			posicao2 = numero1;
		}
		else if (numero2>numero1 && numero2<numero3) {
			posicao2 = numero2;
		}
		else if (numero3>numero1 && numero3<numero2) {
			posicao2 = numero3;
		}
		
		if (numero1>numero2 && numero1>numero3) {
			posicao3 = numero1;
		}
		else if (numero2>numero1 && numero2>numero3) {
			posicao3 = numero2;
		}
		else if (numero3>numero1 && numero3>numero2) {
			posicao3 = numero3;
		}
		
		//saida
		
		System.out.printf("A ordem crescente dos números é: %d %d %d ",posicao1,posicao2,posicao3);
		
	}
	
}
