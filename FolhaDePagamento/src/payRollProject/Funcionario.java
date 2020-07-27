package payRollProject;

import java.util.ArrayList;

public class Funcionario extends Empregado {
	
	public Funcionario(String nome, double salario, String cargo, ArrayList<Bonus> listaDeBonus) {
		
		setNome(nome);
		setSalarioBase(salario);
		setCargo(cargo);
		setListaDeBonus(listaDeBonus);
		setValorDosBonus(super.calculandoValorBonus());
		setSalarioFinal(getSalarioBase() + getValorDosBonus());
		
	}
	
}
