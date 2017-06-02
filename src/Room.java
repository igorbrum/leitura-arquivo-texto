
public class Room {
	
	private String roomCoordinates;
	private String roomNumber;
	private String southNumber;
	private String northNumber;
	private String westNumber;
	private String eastNumber;
	private String upNumber;
	private String downNumber;

	public Room(){
		
		this.southNumber = "no";
		this.northNumber = "no";
		this.westNumber = "no";
		this.eastNumber = "no";
		this.upNumber = "no";
		this.downNumber = "no";
		
	}

	public void setRoomCoordinates(String coordinates) {
		coordinates = coordinates.replace("  ", " ").replace(" ", ";");
		this.roomCoordinates = coordinates;
	}
	
	public String getRoomCoordinates(){
		return this.roomCoordinates;
	}
	
	public void setRoomNumber(String roomNumber){
		this.roomNumber = roomNumber;
	}
	
	public String getRoomNumber(){
		return this.roomNumber;
	}

	public String getSouthNumber() {
		return southNumber;
	}

	public void setSouthNumber(String southNumber) {
		this.southNumber = southNumber;
	}

	public String getNorthNumber() {
		return northNumber;
	}

	public void setNorthNumber(String northNumber) {
		this.northNumber = northNumber;
	}

	public String getWestNumber() {
		return westNumber;
	}

	public void setWestNumber(String westNumber) {
		this.westNumber = westNumber;
	}

	public String getEastNumber() {
		return eastNumber;
	}

	public void setEastNumber(String eastNumber) {
		this.eastNumber = eastNumber;
	}

	public String getUpNumber() {
		return upNumber;
	}

	public void setUpNumber(String upNumber) {
		this.upNumber = upNumber;
	}

	public String getDownNumber() {
		return downNumber;
	}

	public void setDownNumber(String downNumber) {
		this.downNumber = downNumber;
	}
	
	public void splitCoordinates(){
		String c[] = this.roomCoordinates.split(";");
		
		for (int i = 0; i < c.length; i++) {
						
			if (c[i].equals("room")) {
				this.setRoomNumber(c[i+1]);
			}
			
			if (c[i].equals("south")) {
				this.setSouthNumber(c[i+1]);
			}
			
			if (c[i].equals("north")) {
				this.setNorthNumber(c[i+1]);
			}
			
			if (c[i].equals("east")) {
				this.setEastNumber(c[i+1]);
			}
			
			if (c[i].equals("west")) {
				this.setWestNumber(c[i+1]);
			}
			
			if (c[i].equals("up")) {
				this.setUpNumber(c[i+1]);
			}
			
			if (c[i].equals("down")) {
				this.setDownNumber(c[i+1]);
			}
		}
	}

	public String toString() {
		String outputRoomCoordinates = "";
		
		outputRoomCoordinates = "Você está na Sala numero: " + getRoomNumber() + "\n";
		outputRoomCoordinates = outputRoomCoordinates + "Com saida sul para: " + getSouthNumber() + "\n";
		outputRoomCoordinates = outputRoomCoordinates + "Com saida norte para: " + getNorthNumber() + "\n";
		outputRoomCoordinates = outputRoomCoordinates + "Com saida leste para: " + getEastNumber() + "\n";
		outputRoomCoordinates = outputRoomCoordinates + "Com saida oeste para: " + getWestNumber() + "\n";
		outputRoomCoordinates = outputRoomCoordinates + "Com saida acima para: " + getUpNumber() + "\n";
		outputRoomCoordinates = outputRoomCoordinates + "Com saida abaixo para: " + getDownNumber() + "\n";
		
		return outputRoomCoordinates;
	}
}
