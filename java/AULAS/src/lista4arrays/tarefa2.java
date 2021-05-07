package lista4arrays;

import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int numeros [] = new int[5];
		int pares [] = new int [5];
		int somaPares = 0;
		int impares []= new int [5];;
		int quantidadeImpares = 0;
		
		for(int x=0; x<5; x++){
			System.out.println("Digite um número: ");
			numeros[x] = leia.nextInt();
				
			if((numeros[x])%2 == 0 && numeros[x]!=0) {
				
				somaPares = somaPares + numeros[x];
				pares[x] = numeros [x];
				
			}
			
			if((numeros[x])%2 != 0 && numeros[x]!=0) {
				impares[x] = numeros [x];
				quantidadeImpares++;
			}
				
		}
		
		System.out.printf("\nOs números pares digitados são:");
		
		for(int x=0; x<5; x++) {
			
			if(pares[x]!=0) {
				System.out.println(pares[x]);	
			}	
					
		}
		
		System.out.printf("\nOs números ímpares digitados são:");	
		for(int x=0; x<5; x++) {
			if(impares[x]!=0) {
				System.out.println(impares[x]);	
			}	
			
		}
	
		
		System.out.printf("\nA soma dos números pares digitados é: %d",somaPares);
		System.out.printf("\nA quantidade de números ímpares digitados são: %d",quantidadeImpares);
		

}
}
