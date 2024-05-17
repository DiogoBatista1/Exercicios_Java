package Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> Students = new HashSet<Integer>();
        
        // Recebe a info dos estudantes classe A
        System.out.println("How many students for course A? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
        	Students.add(sc.nextInt());
        }
        
     // Recebe a info dos estudantes classe B
        System.out.println("How many students for course B? ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
        	Students.add(sc.nextInt());
        }
        
     // Recebe a info dos estudantes classe C
        System.out.println("How many students for course C? ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
        	Students.add(sc.nextInt());
        }
        
        System.out.println("Total students: " + Students.size());

        sc.close();
    }
}