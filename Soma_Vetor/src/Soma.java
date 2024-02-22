import java.util.Locale;
import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int num = sc.nextInt();
		double Arr[] = new double[num];
		double numElements = 0;
		
		for(int i = 0; i < Arr.length; i++) {
			System.out.println("Digite um numero: ");
			Arr[i] = sc.nextDouble();
			numElements = Arr.length;
		}
		
		System.out.print("VALORES: ");
		for(int i = 0; i < Arr.length; i++) {
			System.out.printf("%.1f", Arr[i]);
			if (i != Arr.length - 1) {
				System.out.print(", ");
			}
		}
		
		double sum = 0;
		
		for(int i = 0; i < Arr.length; i++) {
			sum += Arr[i];
		}
		System.out.printf("\nSOMA: %.2f%n",  sum);
		
		double media = sum / numElements;
		System.out.printf("MEDIA: %.2f%n", media);
		sc.close();
	}
}
