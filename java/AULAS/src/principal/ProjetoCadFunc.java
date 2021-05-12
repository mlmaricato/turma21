package principal;

import entidade.CadFunc;
import entidade.CadFunc2;

public class ProjetoCadFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			CadFunc funcionario=new CadFunc("177774","João",10,10);
			CadFunc2 func2 = new CadFunc2("42327", "Mari", 10, 10, 20);
			
			funcionario.mostrarSalario();
			func2.mostrarSalario();
			
		}

	}


