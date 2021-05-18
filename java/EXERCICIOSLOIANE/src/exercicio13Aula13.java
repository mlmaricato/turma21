import java.util.Scanner;

public class exercicio13Aula13 {
	public static void main(String[] args) {
		
		//Exercício JAVA - Aula 13 - Loiane Groner
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		double salarioHora = 0.0;
		double totalHora = 0.0;
		double salarioBruto = 0.0;
		double inss = 0.0;
		double sindicato = 0.0;
		double impostoRenda = 0.0;
		double descontoTotal = 0.0;
		double salarioLiquido = 0.0;
		
		System.out.println("Digite o valor de seu salário por hora: ");
		salarioHora = leia.nextDouble();
		System.out.println("Digite quantas horas você trabalha por mês: ");
		totalHora = leia.nextDouble();
		
		salarioBruto = totalHora * salarioHora;
		
		System.out.printf("Seu salário bruto é: R$%.2f",salarioBruto);
		
		inss = salarioBruto * 0.08;
		System.out.printf("\nA contribuição ao INSS foi de: R$%.2f",inss);
		
		sindicato = salarioBruto * 0.05;
		System.out.printf("\nA contribuição ao Sindicato foi de: R$%.2f",sindicato);
		
		impostoRenda = salarioBruto * 0.11;
		System.out.printf("\nA contribuição ao IR foi de: R$%.2f",impostoRenda);
		
		descontoTotal = impostoRenda + sindicato + inss;
		System.out.printf("\nO desconto total foi de: R$%.2f",descontoTotal);
		
		salarioLiquido = salarioBruto - descontoTotal;
		System.out.printf("\nO salário Líquido é de: R$%.2f",salarioLiquido);
		
		
		
		
		
		
		
		
		
		
		
	}

}
