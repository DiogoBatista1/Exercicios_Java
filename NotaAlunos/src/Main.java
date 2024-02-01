import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("NOME DO ALUNO: ");
		student.nome = sc.nextLine();
		
		System.out.println("NOTAS DO ALUNO: ");
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println(student.notaFinal());
		System.out.println(student.resultado());
		System.out.println(student.missingPoints());
		
		sc.close();
	}

}
