package lista4arrays;

import java.util.Random;
import java.util.Scanner;

public class tarefa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner leia = new Scanner (System.in);
		Random random = new Random();
	
	//variaveis
	int matriz [][] = new int [3][3];
	int valoresMaiores10 = 0;
	
	System.out.println("A matriz 3 x 3: ");
	for (int linha=0; linha<3; linha++) {
		for (int coluna =0; coluna<3; coluna++) {
			matriz[linha][coluna]=random.nextInt(20);
			System.out.print(matriz[linha][coluna] + "\t");
		}
		System.out.println();
	}
	for (int linha = 0; linha < 3; linha++) {
		for (int coluna = 0; coluna < 3; coluna++) {
			if (matriz[linha][coluna] > 10) {
				valoresMaiores10++;
			}
		}	
	}
		
		System.out.printf("\nA matriz 3 x 3 possui %d valores maiores que 10",valoresMaiores10);
	}
}
		

