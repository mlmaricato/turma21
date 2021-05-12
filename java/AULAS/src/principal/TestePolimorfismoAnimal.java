package principal;

import lista6polimorfismo.Animal;
import lista6polimorfismo.Cachorro;
import lista6polimorfismo.Cavalo;
import lista6polimorfismo.Preguica;

public class TestePolimorfismoAnimal {
	
	public void somAnimal (Animal animal) {
		animal.emitirSom();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestePolimorfismoAnimal teste1 = new TestePolimorfismoAnimal();
		teste1.somAnimal(new Animal());
		teste1.somAnimal(new Cachorro());
		teste1.somAnimal(new Cavalo());
		teste1.somAnimal(new Preguica());
		
}
}
