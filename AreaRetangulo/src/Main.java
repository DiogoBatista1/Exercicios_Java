import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo rect = new Retangulo(); 
		
		System.out.println("Enter retangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rect.Area());
		System.out.printf("Perimeter = %.2f%n", rect.Perimeter());
		System.out.printf("Diagonal = %.2f%n", rect.diagonal());
		sc.close();
	}

}
