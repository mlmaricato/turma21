package principal;

import java.util.Scanner;

import entidade.Paciente;

public class tarefa7_paciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		Paciente paciente1 = new Paciente("Helena", 57, "A+", "Anemia");
		Paciente paciente2 = new Paciente("Hugo", 18, "O-", "Perna quebrada");
		Paciente paciente3 = new Paciente("Isabela", 30, "AB+", "Pedra nos rins");
		
		
		System.out.println("O nome do paciente �: "+paciente1.nome);
		System.out.println("O paciente tem: "+paciente1.idade+" anos");
		System.out.println("O tipo sangu�neo do paciente �: "+paciente1.tipoSangue);
		System.out.println("A enfermidde do paciente �: "+paciente1.enfermidade);
		System.out.println("O paciente recebeu alta? (S/N)");
		char alta;
		alta = leia.next().toUpperCase().charAt(0);
		if (alta =='S') {
			System.out.println("O paciente recebeu alta");
		}
		else {
			System.out.println("O paciente continua internado");
		}
		System.out.println();
		System.out.println("O nome do paciente �: "+paciente2.nome);
		System.out.println("O paciente tem: "+paciente2.idade+" anos");
		System.out.println("O tipo sangu�neo do paciente �: "+paciente2.tipoSangue);
		System.out.println("A enfermidde do paciente �: "+paciente2.enfermidade);
		System.out.println("O paciente recebeu alta? (S/N)");
		alta = leia.next().toUpperCase().charAt(0);
		if (alta =='S') {
			System.out.println("O paciente recebeu alta");
		}
		else {
			System.out.println("O paciente continua internado");
		}
		System.out.println();
		System.out.println("O nome do paciente �: "+paciente3.nome);
		System.out.println("O paciente tem: "+paciente3.idade+" anos");
		System.out.println("O tipo sangu�neo do paciente �: "+paciente3.tipoSangue);
		System.out.println("A enfermidde do paciente �: "+paciente3.enfermidade);
		System.out.println("O paciente recebeu alta? (S/N)");
		alta = leia.next().toUpperCase().charAt(0);
		if (alta =='S') {
			System.out.println("O paciente recebeu alta");
		}
		else {
			System.out.println("O paciente continua internado");
		}
		
		

	}

}
