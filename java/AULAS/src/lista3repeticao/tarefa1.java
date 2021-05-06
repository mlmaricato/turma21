package lista3repeticao;

import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		
		for (int x=1000; x<=1999; x++) {
			if ((x%11) == 5) {
				System.out.printf("\n%d",x);
			}
		}
		

	}

}
