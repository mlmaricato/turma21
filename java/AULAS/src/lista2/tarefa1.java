package lista2;

import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner leia = new Scanner (System.in);
			leia.close();
			
			//variaveis
			int numero1 = 0;
			int numero2 = 0;
			int numero3 = 0;
			
			//entrada
			System.out.println("Digite o primeiro n�mero: ");
			numero1 = leia.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			numero2 = leia.nextInt();
			System.out.println("Digite o terceiro n�mero: ");
			numero3 = leia.nextInt();
			
			//processamento e saida
			
			if (numero1>numero2 && numero1>numero3) {
				System.out.printf("O maior n�mero � %d ",numero1);
			}
			else if (numero2>numero1 && numero2>numero3) {
				System.out.printf("O maior n�mero � %d ",numero2);
				
			}
			else {
				System.out.printf("O maior n�mero � %d ",numero3);
			}

	}
 }

