package payRollProject;

public class Desempenho extends Bonus {
	
	private double bonusDeDesempenho;
	
	public Desempenho(double d) {
		setBonusDeDesempenho(calculandoBonus(d));
	}

	@Override
	public double calculandoBonus(double salarioBase) {
		double bonusDesempenho = salarioBase * 0.05;
		return bonusDesempenho;
	}

	public double getBonusDeDesempenho() {
		return bonusDeDesempenho;
	}

	public void setBonusDeDesempenho(double bonusDeDesempenho) {
		this.bonusDeDesempenho = bonusDeDesempenho;
	}
	
	
}
