package lista3repeticao;

import java.util.Locale;
import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in); //construtor
		
		int idade =0;
		char tipo;
		char opcao;
		final int PESSOAS = 5;
		int x = 1; //contador
		int pessoasCalmas = 0;
		int outrosCalmos = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int pessoasNervosasAcima40Anos = 0;
		int pessoasCalmasMenor18Anos = 0;
		char continua = 'S';
		
		
		while (continua == 'S' && x<=PESSOAS) {
		System.out.printf("Pessoa %d\n",x);
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		System.out.println("Qual gen�ro voc� se identifica: 1 - Feminino; 2- Masculino; 3 - Outre");
		tipo = leia.next().charAt(0);
		System.out.println("Como voc� se classifica: 1 - calma; 2 - nervosa; 3 - agressiva");
		opcao = leia.next().charAt(0);
		//sa�da do loop - while
		System.out.println("Continua S/N: \n");
		continua = leia.next().toUpperCase().charAt(0);
		
		x++; //toda vez que acabar as perguntas soma 1 na quantidade de pessoas que responderam
		
			if (opcao == '1') {
			pessoasCalmas++;
				if (tipo == 'O') {
					outrosCalmos++;
				}				
			}
			
			if (tipo=='1' && opcao=='2') {
				mulheresNervosas++;
				
			}
		
			if (tipo == '2' && opcao == '3') {
				homensAgressivos++;
			}
			
			if (idade>40 && opcao == '2');{
				pessoasNervosasAcima40Anos++;
			}
			
			if (idade<18 && opcao == '1');{
				pessoasCalmasMenor18Anos++;
			}
		}
			
			System.out.printf("\nO n�mero de pessoas calmas �: %d",pessoasCalmas);
			System.out.printf("\nO n�mero de mulheres nervosas �: %d",mulheresNervosas);
			System.out.printf("\nO n�mero de homens agressivos �: %d",homensAgressivos);
			System.out.printf("\nO n�mero de pessoas que se identificam como outres e s�o calmas �: %d",outrosCalmos);
			System.out.printf("\nO n�mero de pessoas nervosas acima de 40 anos �: %d",pessoasNervosasAcima40Anos);
			System.out.printf("\nO n�mero de pessoas calmas menos de 18 anos �: %d",pessoasCalmasMenor18Anos);
		}
	}



