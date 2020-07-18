package payRollProject;

import java.util.ArrayList;

abstract class Empregado {
	
	private String nome;
	private String cargo;
	private Double salarioBase;
	private ArrayList<Bonus> listaDeBonus = new ArrayList<Bonus>();
	private Double valorDosBonus;
	private Double salarioFinal;
	
	public Empregado() {
		valorDosBonus = 0.0;
		salarioFinal = 0.0;
		setValorDosBonus(calculandoValorBonus());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Double getValorDosBonus() {
		return valorDosBonus;
	}
	public void setValorDosBonus(Double valorDosBonus) {
		valorDosBonus = calculandoValorBonus();
	}
	public Double getSalarioFinal() {
		return salarioFinal;
	}
	
	public void setSalarioFinal(Double salarioFinal) {
		double valor = salarioFinal + getValorDosBonus();
		salarioFinal = valor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public ArrayList<Bonus> getListaDeBonus() {
		return listaDeBonus;
	}

	public void setListaDeBonus(ArrayList<Bonus> listaDeBonus) {
		this.listaDeBonus = listaDeBonus;
	}
	
	public double calculandoValorBonus() {
		double totalDeBonus = 0;
		for(Bonus bonus: getListaDeBonus()) {
			totalDeBonus += bonus.calculandoBonus(getSalarioBase());
		}
		
		return totalDeBonus;	
	}


	
}
