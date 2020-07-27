package payRollProject;

import java.util.ArrayList;

public class Gerente extends Empregado {

	public Gerente(String nome, double salario,String cargo, ArrayList<Bonus> listaDeBonus) {
		
		setNome(nome);
		setSalarioBase(salario);
		setCargo(cargo);
		setListaDeBonus(listaDeBonus);
		setValorDosBonus(super.calculandoValorBonus());
		setSalarioFinal(getSalarioBase() + getValorDosBonus());
			
	}

}
