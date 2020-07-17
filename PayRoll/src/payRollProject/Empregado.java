package payRollProject;

import java.util.ArrayList;

abstract class Empregado {
	
	private String nome;
	private String cargo;
	private Double salarioBase;
	private ArrayList<Bonus> listaDeBonus;
	private Double valorDosBonus;
	private Double salarioFinal;
	
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
		this.valorDosBonus = valorDosBonus;
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
	
}
