package lista3repeticao;

import java.util.Scanner;

public class tarefa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int idade = 0;
		int total21 = 0;
		int total50 = 0;
		
		
		while (idade != -99) {
			
			System.out.println("Digite sua idade");
			idade = leia.nextInt();
			
			if(idade>0 && idade<21) {
				total21++;
			}
			else if (idade>50) {
				total50++;
			}
		}
			
		
			System.out.printf("\nO n�mero de pessoas com menos de 21 anos � %d",total21);
			System.out.printf("\nO n�mero de pessoas com mais de 50 anos � %d",total50);
			
		}
		
	}

