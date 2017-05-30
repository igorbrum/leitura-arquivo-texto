import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.senac.SimpleJava.Console;

public class Principal {
	
	String room[] = new String[31];
	
	public void run(){
		Console.println("Leitura de arquivo texto");
		
		String nameFile = addFile();
		readFile(nameFile);
		showFile();
	}

	private String addFile() {
		String nameFile = "Files/Labirinto.txt";
		return nameFile;
	}

	private void readFile(String nameFile) {
		try {
			@SuppressWarnings("resource")
			Scanner fileToRead = new Scanner(new FileInputStream(nameFile));
			int i = 0;
			
			while (fileToRead.hasNext()) {
				String string = fileToRead.nextLine();
				room[i] = string;
				i++;
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("Sem arquivo, idiota.");
		} catch (Exception e) {
			System.err.println("Arquivo Invalido");
		}
	}
	
	private void showFile() {
		for (int i = 0; i < room.length-1; i++) {
			Console.println(room[i]);
		}
	}

}
