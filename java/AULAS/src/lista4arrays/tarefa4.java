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
			System.out.println(
					"\n(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes");
			System.out.println("Digite o numero da sua escolha :");
			op = leia.next().charAt(0);
			switch (op) {
			case '1': {
				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						matrizSoma[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
						System.out.printf("Soma de m1 + m2 na posição %d - %d = %.0f + %.0f --> %.0f\n", linha, coluna,
								matriz1[linha][coluna], matriz2[linha][coluna], matrizSoma[linha][coluna]);
					}
				}
			}
				break;
			case '2': {
				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						matrizSubtracao[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna];
						System.out.printf("A subração de m1 - m2 na posição %d - %d = %.0f - %.0f --> %.0f\n", linha,
								coluna, matriz1[linha][coluna], matriz2[linha][coluna], matrizSubtracao[linha][coluna]);
					}
				}
			}
				break;
			case '3': {
				System.out.print("Digite o valor da constante: ");
				final double VALOR = leia.nextDouble();
				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						matriz1[linha][coluna] += VALOR;
						matriz2[linha][coluna] += VALOR;
					}
				}

			}
				break;
			case '4': {
				System.out.println("MATRIZ 1");
				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						System.out.printf("%.0f\t", matriz1[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("MATRIZ 2");
				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						System.out.printf("%.0f\t", matriz2[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("MATRIZ SOMA");
				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						System.out.printf("%.0f\t", matrizSoma[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("MATRIZ SUBTRAÇÃO");
				for (int linha = 0; linha < 2; linha++) {
					for (int coluna = 0; coluna < 2; coluna++) {
						System.out.printf("%.0f\t", matrizSubtracao[linha][coluna]);
					}
					System.out.println();
				}
			}
				break;
			default:
				break;

			}

		} while (op != '4');

		System.out.println("FIM DO PROGRAMA!!!");

	}

}