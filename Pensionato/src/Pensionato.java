import java.util.Locale;
import java.util.Scanner;

import Entities.Room;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int rentedRooms = sc.nextInt();
		sc.nextLine();
		
		Room rooms[] = new Room[rentedRooms];
		
		for(int i = 0; i < rentedRooms; i++) {
			System.out.printf("Rent #%d: \n", i + 1);
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Room: ");
			int roomNum = sc.nextInt();
			sc.nextLine(); 
			
			rooms[i] = new Room(name, email, roomNum);
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.printf("%d: %s, %s \n", rooms[i].getRoomNumber(), rooms[i].getName(), rooms[i].getEmail());
			}
		}

		
		sc.close();
	}
}
