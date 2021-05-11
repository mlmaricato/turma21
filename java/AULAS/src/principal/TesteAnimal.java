package principal;

import java.util.Scanner;

import lista6heranca.Cachorro;
import lista6heranca.CachorroCaseiro;
import lista6heranca.Cavalo;
import lista6heranca.Preguica;



public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		Cachorro cachorro1 = new Cachorro ("Du", 9);
		Cavalo cavalo1 = new Cavalo ("Pietro", 5);
		Preguica preguica1 = new Preguica("Tonya", 7);
		CachorroCaseiro cachorro2 = new CachorroCaseiro ("Tomy", 4, "Grande", 'M');
		
		
		System.out.println("O nome do cachorro é: "+cachorro1.getNome());
		System.out.printf("O cachorro tem: %d anos.\n",cachorro1.getIdade());
		cachorro1.som();
		cachorro1.movimento();
		System.out.println("O cachorro caseiro late assim...");
		cachorro2.som();
		System.out.println();
		
		System.out.println("O nome do cavalo é: "+cavalo1.getNome());
		System.out.printf("O cavalo tem: %d anos \n",cavalo1.getIdade());
		cavalo1.som();
		cavalo1.movimento();
		System.out.println();
		
		System.out.println("O nome da preguiça é: "+preguica1.getNome());
		System.out.printf("A preguiça tem: %d anos \n",preguica1.getIdade());
		preguica1.som();
		preguica1.movimento();

		}

}
