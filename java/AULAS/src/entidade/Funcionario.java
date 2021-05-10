package entidade;

public class Funcionario {
	
	//atributos
	public String nome;
	public int anoNascimento;
	public char genero;
	public double salario;
	
	//construtores
	
	public Funcionario (String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	//metodos
	
	public void mostrarIdade() {
		System.out.println("A idade do funcionário é: "+(2021 - anoNascimento));
	}
	
	//sobrecarga
	public void mostrarIdade(int anoAtual) {
		System.out.println("A idade do funcionário é: "+(anoAtual - anoNascimento));
	}
}
	
