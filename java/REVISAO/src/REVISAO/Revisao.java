package REVISAO;

import java.util.Scanner;

import classes.Circulo;
import classes.Geladeira;
import classes.Quadrado;

public class Revisao {
	public static void main(String[] args) {
		//quadrado, triângulo - triângulo retângulo, isósceles, círculo. Calcule a área e o perímetro
		
		//variavel
		//int ladoA;
		
		Scanner leia = new Scanner (System.in);
		//Circulo circulo = new Circulo (); //instanciar o objeto circulo que pertence a classe circulo
	
		Quadrado quadrado = new Quadrado (2.3, 2.3, 2.3, 2.3);
		quadrado.area();
		System.out.println(quadrado.area());
		
		Circulo circulo = new Circulo (5.6);
		circulo.area();
		System.out.println(circulo.area());
		circulo.perimetro();
		System.out.println(circulo.perimetro());
		
		System.out.println("Informe o valor do lado A: ");
		double ladoA = leia.nextDouble(); 
		System.out.println("Informe o valor do lado B:");
		double ladoB = leia.nextDouble(); 
		System.out.println("Informe o valor do lado C: ");
		double ladoC = leia.nextDouble(); 
		System.out.println("Informe o valor do lado D: ");
		double ladoD = leia.nextDouble(); 
		
		Quadrado quadrado1 = new Quadrado (ladoA,ladoB, ladoC, ladoD );
		quadrado1.area();
		System.out.println(quadrado1.area());
		
		Geladeira geladeira = new Geladeira("Brastemp", 110, 10, "Duas portas");
		geladeira.ligar();
		
		
		
		
		
	}
}
