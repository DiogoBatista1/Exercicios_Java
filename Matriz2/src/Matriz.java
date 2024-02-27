import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] mat = new int[x][y];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Digite o número desejado: ");
		int wishNum = sc.nextInt();
		boolean condition = false;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == wishNum) {
					condition = true;
					System.out.printf("Postion: %d, %d%n", i, j);
					
					if(j > 0) {
						System.out.printf("Left: %d%n", mat[i][j - 1]);
					}
					if(j < mat[i].length - 1) {
						System.out.printf("Right: %d%n", mat[i][j + 1]);
					}
					if(i > 0) {
						System.out.printf("Top: %d%n", mat[i - 1][j]);
					}
					if(i < mat.length - 1) {
						System.out.printf("Bottom: %d%n", mat[i + 1][j]);
					}
					
				} 
			}
			
			if (!condition) {
	            System.out.println("Número não encontrado na matriz.");
	        }
			System.out.println();
		}
		
		sc.close();
	}

}
