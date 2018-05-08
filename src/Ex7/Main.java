package Ex7;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		File fisier1 = new File("D:\\exercitii\\ex7fisier1.txt");
		File fisier2 = new File("D:\\exercitii\\ex7fisier2.txt");
		File fisier3 = new File("D:\\exercitii\\ex7fisier3.txt");
		
		try {
			fisier1.createNewFile();
			fisier2.createNewFile();
			fisier3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
	}
	OutputStream fos = null;
	DataOutputStream dos = null;
	
	try {
		   fos = new FileOutputStream(fisier1);
		   dos = new DataOutputStream(fos);
		    
		   for (int i = 0; i < 3; i++) {
		      dos.writeInt((int) (Math.random()*10));
		   }
		    
		   dos.flush();
		    
		} catch (FileNotFoundException e) {
		   e.printStackTrace();
		} catch (IOException e) {
		   e.printStackTrace();
		} finally {
		   try {
		      dos.close();
		   } catch (IOException e) {
		      e.printStackTrace();
		   }
		}
	
	}
}
