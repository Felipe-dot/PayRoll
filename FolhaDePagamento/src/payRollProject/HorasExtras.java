package payRollProject;

public class HorasExtras extends Bonus {

	private int QtdeHoras;
	private String diaDaSemana;
	private Double bonusHoraExtra;
	
	public HorasExtras(double salarioBase, String diaDaSemana, int qtdeHorasExtras) {
		setDiaDaSemana(diaDaSemana);
		setQtdeHoras(qtdeHorasExtras);
		setBonusHoraExtra(calculandoBonus(salarioBase));
		
	}
	
	@Override
	public double calculandoBonus(double salarioBase) {
		double bonusHora = salarioBase * getQtdeHoras() * 0.001; 
		return bonusHora;
	}
	
	public int getQtdeHoras() {
		return QtdeHoras;
	}

	public void setQtdeHoras(int qtdeHoras) {
		QtdeHoras = qtdeHoras;
	}
	
	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public Double getBonusHoraExtra() {
		return bonusHoraExtra;
	}

	public void setBonusHoraExtra(Double bonusHoraExtra) {
		this.bonusHoraExtra = bonusHoraExtra;
	}
	
	
}

