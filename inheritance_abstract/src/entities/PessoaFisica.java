package entities;

public class PessoaFisica extends Pessoa {
	private Double healthExpenses;
	
	public PessoaFisica(String name, Double anualIncome, Double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double Tax() {
		Double anualIncome = getAnualIncome();
		
		if(anualIncome < 20000.00) {
			return anualIncome * 0.15 - (healthExpenses * 0.5);
		} else {
			return anualIncome * 0.25 - (healthExpenses * 0.5);
		}
	}
}
