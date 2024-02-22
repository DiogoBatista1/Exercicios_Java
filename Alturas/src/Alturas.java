import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import javax.print.attribute.standard.MediaPrintableArea;

import Entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int numPessoas = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] pessoas = new Pessoa[numPessoas];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.println("Nome: ");
			String name = sc.nextLine();
			
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			
			pessoas[i] = new Pessoa(name, idade, altura);
		}
		
		double mediaAltura = 0;
		int contarMenores16 = 0;
		
		for(int i = 0; i < pessoas.length; i++) {
			mediaAltura += pessoas[i].altura;
			if(pessoas[i].idade < 16) {
				contarMenores16++;
			}
		}
		mediaAltura /= numPessoas;
		
		System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%%n", ((double) contarMenores16 / numPessoas) * 100);

		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].idade < 16) {
				System.out.println(pessoas[i].name);
			}
		}
	}

}
