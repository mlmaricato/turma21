package classes;

public class TrianguloRetangulo extends Triangulo implements AreaPerimetro{
	//atributos
	private int altura;
	private int base;
	
	//construtores
	public TrianguloRetangulo(double ladoA, double ladoB, double ladoC, int altura, int base) {
		super(ladoA, ladoB, ladoC);
		this.altura = altura;
		this.base = base;
	}
	
	
	@Override
	public double area() {
		int area = altura * base;
		return area;
	}
	@Override
	public double perimetro() {
		double perimetro = super.getLadoA() + super.getLadoB() + super.getLadoC();
		return perimetro;
	}
	
	
	
	
	

}
