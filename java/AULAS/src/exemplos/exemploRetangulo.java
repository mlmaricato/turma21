package exemplos;

import java.util.Scanner;

public class exemploRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner leia = new Scanner (System.in);
			
			//variaveis
			double base1 = 0.0;
			double altura1 = 0.0;
			double base2 = 0.0;
			double altura2 = 0.0;
			double area1 = 0.0;
			double area2 = 0.0;
			
			System.out.println("Digite a base 1:");
			base1 = leia.nextDouble();
			System.out.println("Digite a altura1 ");
			altura1 = leia.nextDouble();
			System.out.println("Digite a base 2:");
			base2 = leia.nextDouble();
			System.out.println("Digite a altura2 ");
			altura2 = leia.nextDouble();
			
			area1 = base1 * altura1;
			area2 = base2 * altura2;
			
			if(area1 > area2) {
				System.out.printf("O primeiro ret�ngulo � o maior (�rea 1 = %.0f)",area1);
			}
			else if (area1 < area2) {
				
				System.out.printf("O segundo ret�ngulo � o maior (�rea 2 = %.0f)",area2);
			}
			else {
				System.out.println("Os ret�ngulos s�o iguais");
			}
			
			
	}

}
