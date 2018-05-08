package Ex6;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		File fisier = new File("D:\\exercitii\\ex6fisier.txt");
		
		try {
			fisier.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int s=0;
		int s2=0;
		int contor = 0;
		FileWriter fw = null;
		BufferedWriter bf = null;
		
		try {
			fw = new FileWriter(fisier);
			bf = new BufferedWriter(fw);
			
			bf.write("5");
			bf.newLine();
			bf.write("7");
			bf.newLine();
			bf.write("12");
			
		} catch (IOException e) {
			
		} finally {
			if(bf != null) {
				bf.close();
			}
			if(fw != null) {
				fw.close();
			}
		}
		
		try {
			Scanner sc = new Scanner(fisier);
			//s += Integer.parseInt(sc.next());
			s2 += sc.nextInt();
			//System.out.println(s);
			System.out.println(s2);
			while(sc.hasNext()) {
				contor= sc.nextInt();
				System.out.println(contor);
				s2 += contor;
				
			}	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println(s2);
		}
	}

}
