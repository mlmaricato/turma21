package lista2;

import java.util.Scanner;

public class tarefa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);

		
		//variaveis
		int idade = 0;
		
		//entrada
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("Sua categoria é: infantil");
		}
		else if (idade>=15 && idade<=17) {
			System.out.println("Sua categoria é: juvenil");
		}
		else if (idade>=18 && idade<=25) {
			System.out.println("Sua categoria é: adulto");
		}
		leia.close();
	}
	
}
