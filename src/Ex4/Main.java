package Ex4;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		File fisier = new File("D:\\exercitii\\ex4fisier.txt");
		String nume = new String("George Iordache");

		try {
			fisier.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileWriter writer = new FileWriter(fisier);

		try {
			writer.write(nume);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}

	}

}
