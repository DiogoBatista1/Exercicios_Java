import java.util.Locale;
import java.util.Scanner;

public class Negativos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int Arr[] = new int[sc.nextInt()];
		
		for(int i = 0; i < Arr.length; i++) {
			System.out.println("Digite um numero: ");
			Arr[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i = 0; i < Arr.length; i++) {
			if(Arr[i] < 0) {
			 System.out.println(Arr[i]);
			}
		}
		
		
	}
}
