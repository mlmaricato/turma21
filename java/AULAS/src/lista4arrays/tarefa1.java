package lista4arrays;

import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int [] A = {1, 0, 5, (-2), (-5), 7}; //vetor A de 6 posições
		int soma = 0; //soma das três posições.
		
		System.out.println("Digite a relação de valores do vetor:");
		
		for (int x=0; x<6; x++) {
			System.out.println(A[x]);
		}
	
		soma = A[0] + A[1] + A[5];
		
		A[4] = 100;
		
		System.out.println("Apresentando os alores do vetor A:");
		
		for (int x=0; x<6; x++) {
			System.out.println(A[x]);
		}
		
		System.out.printf("A soma dos vetores de posição A[0], A[1] e A[5] é: %d",soma);
	}
}







