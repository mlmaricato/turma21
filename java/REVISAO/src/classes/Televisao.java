package classes;

public class Televisao extends Eletrodomestico {
	
	private String polegadas;
	private boolean controleRemoto;
	
	
	public Televisao(String marca, int voltagem, double peso, String polegadas, boolean controleRemoto) {
		super(marca, voltagem, peso);
		this.polegadas = polegadas;
		this.controleRemoto = controleRemoto;
	}
	
	@Override
	public void ligar() {
	System.out.println("Ligar na tomada e apertar o botão");
	}

	
}
