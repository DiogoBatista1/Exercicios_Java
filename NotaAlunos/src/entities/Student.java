package entities;

public class Student {
	public String nome;
	public double nota1, nota2, nota3;
	public double media = 60;
	double notaF = notaFinal();
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String resultado() {
		if(notaF > media) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}
	
	public String missingPoints() {
		double missingP = media - notaF;
		return "MISSING " + missingP + " POINTS";
	}
}