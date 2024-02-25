import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employees {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
        int numEmployees = sc.nextInt();
        sc.nextLine(); 

        List<Integer> id = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<Double> salary = new ArrayList<>();

        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("Employee #%d:%n", i + 1);
            System.out.println("Id:");
            id.add(sc.nextInt());
            sc.nextLine(); 

            System.out.println("Name:");
            name.add(sc.nextLine());

            System.out.println("Salary:");
            salary.add(sc.nextDouble());
            sc.nextLine();
        }

        System.out.println("Enter the employee id that will have a salary increase:");
        int newId = sc.nextInt();
        sc.nextLine(); // Consume newline

        int index = id.indexOf(newId);
        if (index != -1) {
            System.out.println("Enter the percentage:");
            double percentage = sc.nextDouble();
            double newSalary = salary.get(index) * (1 + percentage / 100);
            salary.set(index, newSalary);
        } else {
            System.out.println("Employee id not found.");
        }

        System.out.println("Updated employee details:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("%d, %s, %.2f%n", id.get(i), name.get(i), salary.get(i));
        }

        sc.close();
    }
}