package classes;

public abstract class Triangulo { //não pode estanciar
	//atributos
	
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	
	
	//construtores
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	//getters and setters
	public double getLadoA() {
		return ladoA;
	}


	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}


	public double getLadoB() {
		return ladoB;
	}


	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}


	public double getLadoC() {
		return ladoC;
	}


	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	//metodo
	//public double perimetro (double ladoA, double ladoB, double ladoC) {
		//return ladoA + ladoB + ladoC;
	
	
}

