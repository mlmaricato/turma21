package exemplos;

import java.util.Scanner;

public class exercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		
		//variaveis
		int numero = 1;
		int somatorio = 0;
		double media = 0;
		int totalValoresLidos = 0;
		int quantidadeVezes = 0;
		
		while (numero != 0){
			System.out.println("Informe um numero: ");
			numero = leia.nextInt();
			
			somatorio = somatorio + numero;
			
			if(numero>0){
				totalValoresLidos++;
			}
			
			else {
				break;
			}
			media = somatorio / totalValoresLidos; 
		}
		
		//saida
		
		System.out.printf("\nA soma dos valores informados é de: %d ",somatorio);
		System.out.printf("\nA quantidade de vezes que foram informados numeros diferentes de 0 foi de: %d vezes",totalValoresLidos);
		System.out.printf("\nA média dos numeros informados é: %.2f ",media);
		
	}
}
		
		
			
	

				
		
