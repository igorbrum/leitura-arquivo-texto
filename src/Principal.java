import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {
	
	public Room room[] = new Room[31];
	
	public void run(){
		String nameFile = addFile();
		readFile(nameFile);
	}

	private String addFile() {
		String nameFile = "Files/Labirinto.txt";
		return nameFile;	
	}
	
	private void readFile(String nameFile) {
		try {
			Scanner fileToRead = new Scanner(new FileInputStream(nameFile));
			int i = 0;
			while (fileToRead.hasNext()) {
				String coordinates = fileToRead.nextLine();
				room[i] = room(coordinates);
				i++;
			}
			fileToRead.close();
		} catch (FileNotFoundException fnfe) {
			System.err.println("Arquivo nao encontrado");
		} catch (Exception e) {
			System.err.println("Erro interno do sistema");
		}
	}

	private Room room(String coordinates) {
		Room r = new Room();
		r.setRoomCoordinates(coordinates);
		r.splitCoordinates();		
		return r;
	}
}