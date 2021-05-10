package principal;

import java.util.Scanner;

import entidade.Funcionario;

public class tarefa4_funcionario {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
		
		Funcionario funcionario1 = new Funcionario("Paulo", 2000);
		funcionario1.anoNascimento = 1976;
		Funcionario funcionario2 = new Funcionario ("Isabel", 3000);
		funcionario2.anoNascimento = 1987;
		Funcionario funcionario3 = new Funcionario ("Bia", 1500);
		funcionario3.anoNascimento = 1990;
		
		System.out.println("O nome do funcionário é: "+funcionario1.nome);
		funcionario1.mostrarIdade();
		System.out.println("O salário é R$ " +funcionario1.salario);
		
		System.out.println("O nome do funcionário é: "+funcionario2.nome);
		funcionario2.mostrarIdade();
		System.out.println("O salário é R$ " +funcionario2.salario);
		
		System.out.println("O nome do funcionário é: "+funcionario3.nome);
		funcionario3.mostrarIdade();
		System.out.println("O salário é R$ " +funcionario3.salario);
	
	}
	

}
