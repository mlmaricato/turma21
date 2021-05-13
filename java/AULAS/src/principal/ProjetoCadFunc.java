package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.CadFunc;
import entidade.CadFunc2;

public class ProjetoCadFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*CadFunc funcionario=new CadFunc("177774","João",10,10);
			CadFunc2 func2 = new CadFunc2("42327", "Mari", 10, 10, 20);
			
			funcionario.mostrarSalario();
			System.out.println(funcionario);
			
			func2.mostrarSalario();
			System.out.println(func2);
			
			*/	
		
		//CadFunc2 terceiro = new CadFunc2("Jane", "XX2", 20, 25.50, 15.15);
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		List<CadFunc> lista = new ArrayList <>();
		
		System.out.println("Cadastro de funcionários: ");
		System.out.println("Digite a quantidade de funcionário a ser cadastrada: ");
		int qtde = leia.nextInt();
		
		for(int x=1; x<=qtde; x++) {
			System.out.println("Digite: 1 - Funcionario ou 2 - Funcionario Terceirizado");
			char op = leia.next().charAt(0);
			System.out.println("Digite o nome: ");
			String nome = leia.next().toUpperCase();
			System.out.println("Digite a matrícula: ");
			String matricula = leia.next().toUpperCase();
			System.out.println("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite o valor por hora: ");
			double valorHora = leia.nextDouble();
			if(op == '2') {
				System.out.println("Qual o valor do adicional: R$ ");
				double adicional = leia.nextDouble();	
				lista.add(new CadFunc2(nome,matricula,horasTrabalhadas,valorHora,adicional));
			} 
			else {
				lista.add(new CadFunc(nome,matricula,horasTrabalhadas,valorHora));
			}
			
		}
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTOS");
		
		//FOR EACH
		for (CadFunc func1: lista) {
			System.out.println(func1.getMatricula()+" seu salário é: R$ "+func1.mostrarSalario());
			
		}
		
	}
}
		


