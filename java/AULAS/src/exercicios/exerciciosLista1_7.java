package exercicios;

import java.util.Scanner;

public class exerciciosLista1_7 {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;
		double x = 0.0;
		double y = 0.0;
		
		//entradas
		System.out.println("Defina o valor para a: ");
		a = leia.nextDouble();
		System.out.println("Defina o valor para b: ");
		b = leia.nextDouble();
		System.out.println("Defina o valor para c: ");
		c = leia.nextDouble();
		System.out.println("Defina o valor para d: ");
		d = leia.nextDouble();
		System.out.println("Defina o valor para e: ");
		e = leia.nextDouble();
		System.out.println("Defina o valor para f: ");
		f = leia.nextDouble();
		
		//processamento
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		//saida
		System.out.println("O valor de x é: "+x);
		System.out.println("O valor de y é: "+y);
			
		
	}

}
