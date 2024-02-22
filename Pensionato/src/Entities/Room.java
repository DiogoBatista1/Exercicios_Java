package Entities;

public class Room {
	public String name;
	public String email;
	public int roomNumber;
	
	public Room(String name, String email, int roomNumber) {
		this.name = name;
		this.email = email;
		this.roomNumber = roomNumber;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
}
