package classes;

public class Quadrado implements AreaPerimetro {
	//atributos
	private double ladoA;
	private double ladoB;
	private double ladoC;
	private double ladoD;
	
	//construtor
	public Quadrado (double ladoA, double ladoB, double ladoC, double ladoD) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
	}
	
	
	//metodos
	public double area(double ladoA, double ladoB) {
		return ladoA*ladoB;
		
	}
	
	public double perimetro (double ladoA, double ladoB, double ladoC, double ladoD) {
		return ladoA + ladoB + ladoC + ladoD;

	}

	@Override
	public double area() {
		double area = ladoA * ladoB;
		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = ladoA+ ladoB + ladoC + ladoD;
		return perimetro;
	}
	
}



