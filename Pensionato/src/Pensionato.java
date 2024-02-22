import java.util.Locale;
import java.util.Scanner;

import Entities.Room;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room rooms[] = new Room[9];
		
		rooms[0] = new Room("Diof", "Das", 1);
		
		System.out.println("How many rooms will be rented? ");
		int rentedRooms = sc.nextInt();
		
		for(int i = 0; i < rentedRooms; i++) {
			System.out.println("Name: ");
			String name = sc.next();
			rooms[i] = new Room(name, "", 0);
			
			System.out.println("Email: ");
			String email = sc.next();
			rooms[i].setEmail(email);
			
			System.out.println("Room: ");
			int roomNum = sc.nextInt();
			rooms[i].setRoomNumber(roomNum);
		}
		
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println("Rent: ");
				System.out.println("Name: " + rooms[i].getName());
				System.out.println("Email: " +  rooms[i].getEmail());
				System.out.printf("Room: %d\n" ,rooms[i].getRoomNumber());
			}
		}

		
		sc.close();
	}
}
