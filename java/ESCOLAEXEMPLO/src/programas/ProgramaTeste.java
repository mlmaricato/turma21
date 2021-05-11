package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Estudante;

public class ProgramaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);

		/* Estudante alunoED = new Estudante(10, "845.323.553-12"); //instanciamento do objeto
		Estudante alunoAline = new Estudante(1, "333.555.777.-88", true);
		
		alunoED.setCpf("XXX.XXX.XXX-XX");
	
		System.out.println(alunoED.getCpf());
		System.out.println(alunoAline.getCpf());
		
		System.out.println("Digite a nota do aluno do ED: ");
		double pontos = leia.nextDouble();
		alunoED.adicionarNota(pontos);
		System.out.println("Matricula:"+alunoED.getMatricula()+ " "+ " nota: "+alunoED.getPontos());
		*/
		
		System.out.println("Digite o numero da matricula: ");
		int matricula = leia.nextInt();
		System.out.println("Digite o CPF: ");
		String cpf = leia.next();
		System.out.println("Digite o dia do aniversário: ");
		int dia = leia.nextInt();
		System.out.println("Digite a nota inicial: ");
		double nota = leia.nextDouble();
		
		
		Basico aluno1 = new Basico(matricula, cpf, dia); //instanciando o objeto
		
		aluno1.adicionarNota(nota);
		System.out.printf("\nPONTOS ATUAIS do aluno: %.2f",aluno1.getPontos());
		System.out.println("\nDigite o dia atual: ");
		int diaAtual = leia.nextInt();
		aluno1.bonusAniversario(diaAtual);
		System.out.printf("\nPontos após método do aluno: %.2f ",aluno1.getPontos());
		
	}

}
