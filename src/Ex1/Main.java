package Ex1;

import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		File fisier = new File("D:\\exercitii\\Ex1fisier.txt");
		boolean a = fisier.createNewFile();
		System.out.println(a);
		File dir = new File("D:\\exercitii\\directoex1");
		dir.mkdir();
		
		FileWriter write = new FileWriter(fisier,true);
		write.write("Maria este bubu!");
		write.write("asdasda");
		write.flush();
		write.close();
		
		FileReader reader = new FileReader("D:\\exercitii\\Ex1fisier.txt");
		char[] myChars = new char[50];
		reader.read(myChars);
		reader.close();
		for (char c : myChars) {
		System.out.print(c);
		
		
		}
	}
	
}
