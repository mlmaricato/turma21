package lista4arrays;

import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		double matriz1 [] [] = new double [2][2];
		double matriz2 [] [] = new double [2][2];
		double matrizSoma [] [] = new double [2][2];
		double matrizSubtracao [] [] = new double [2][2];
		double auxConstante = 0.00;
		char op;
		
		//montagem da matriz
		for (int linha = 0; linha <2; linha ++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Valor da matriz1 na posição %d - %d: ",linha,coluna);
				matriz1[linha][coluna]=leia.nextDouble();
				System.out.printf("Valor da matriz2 na posição %d - %d: ",linha,coluna);
				matriz2[linha][coluna]=leia.nextDouble();
			}
		}
		
		do {
			System.out.println("\n(1)Soma das duas matrizes; \n(2)Subtração; ");
			System.out.println("Digite o número da su escolha:");
			op = leia.next().charAt(0);
			switch (op) {
			
			case '1':
				{
				for(int linha=0;linha<2;linha++) {
					for (int coluna=0; coluna<2;coluna++) {
						matrizSoma[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
						System.out.printf("Soma de m1 + m2 na posição %d - %d = &f + %f\n",linha, coluna,matriz1[linha][coluna],matriz2[linha][coluna]);
						
					}
			}
				}
			break;
			case '2':{
				for(int linha=0;linha<2;linha++) {
					for (int coluna=0; coluna<2;coluna++) {
						matrizSoma[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
						System.out.printf("Subtracao de m1 + m2 na posição %d - %d = &f + %f\n",linha, coluna,matriz1[linha][coluna],matriz2[linha][coluna]);
						
				
			break;
			case '3':
			break;
			case '4':
			break;
			default :
			break;
			}
			}
			
		}while(op!=4);
	}

}
