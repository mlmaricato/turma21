package exemplos;

import java.util.Scanner;

public class exemploVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int pontos [] = new int[5]; //0 - 4
		int maiorPontuacao = 0;
		
		for(int x=0;x<5;x++) {
			System.out.println("Digite sua pontuação: ");
			pontos[x] = leia.nextInt();
			if (maiorPontuacao < pontos[x]) {
				maiorPontuacao = pontos[x];
			}
		}
		
		System.out.printf("\nA maior pontuação é: %d",maiorPontuacao);
		

	}

}
