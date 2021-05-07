package exemplos;

public class exemploVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String times [] = {"SPFC", "PALMEIRAS", "SANTOS", "CORINTHIANS"};

		
			//for (int x=0; x< times.length; x++) { //quando nao sei o tamanho do vetor
				//System.out.println("Nome time "+times[x]);
			//}
		
		for (String nome : times) {
			System.out.println("Nome do time é: "+nome);
			
		}
	}
	
	

}
