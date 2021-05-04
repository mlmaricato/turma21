package exercicios;

import java.util.Scanner;

public class exerciciosLista1_6 {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		double x1 = 0.0;
		double x2 = 0.0;
		double y1 = 0.0;
		double y2 = 0.0;
		double dTotal = 0.0;
		double distanciaX = 0.0;
		double distanciaY = 0.0;
		
		
		//entrada
		System.out.println("Digite um valor para x1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite um valor para x2" );
		x2 = leia.nextDouble();
		System.out.println("Digite um valor para y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite um valor para y2: ");
		y2 = leia.nextDouble();
		
		//processamento
		distanciaX = Math.pow((x2 - x1), 2);
		distanciaY = Math.pow((y2 - y1), 2);
		dTotal = Math.sqrt(distanciaX + distanciaY);
		
		//saida
		System.out.println("A distância total é: "+dTotal);
		
		
		
		
		
			
		
		
		
		
	}

}
