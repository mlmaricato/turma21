package entidade;

public class CadFunc2 extends CadFunc {
	
	private double adicional;

	public CadFunc2(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		// TODO Auto-generated constructor stub
		this.adicional = adicional;
	}

	public CadFunc2(String matricula, String nome) {
		super(matricula, nome);
		// TODO Auto-generated constructor stub
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override

	public void mostrarSalario() {
		System.out.println("O calculo do terceiro é: "+(calcularSalario()+adicional));
	}
}


