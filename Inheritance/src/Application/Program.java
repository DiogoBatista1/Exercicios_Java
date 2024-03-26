package Application;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int numProd = sc.nextInt();
		
		for(int i = 1; i <= numProd; i++) {
			System.out.printf("Product #%d data:%n", i);
			System.out.println("Common, used or imported (c/u/i)?");
			String prodType = sc.next();
			
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Price:");
			double price = sc.nextDouble();
			
			if(prodType.equalsIgnoreCase("u")) {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				productList.add(new UsedProduct(name, price, data));
			} 
			else if(prodType.equalsIgnoreCase("i")){
				System.out.println("Customs fee:");
				Double customFee = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, customFee));
			} 
			else if(prodType.equalsIgnoreCase("c")) {
				productList.add(new Product(name, price));
			}
			else {
				System.out.println("Por favor, digite um valor valido! Digite c, u, ou i.");
				i--;
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for(Product prod : productList) {
			System.out.println(prod.priceTag());
		}
	}
}
