package Ex3;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		String desen = ""
			       + "+———————————————————————————————————+" + "\n"
			       + "|                              #### |" + "\n"
			       + "|                              #### |" + "\n"
			       + "|                              #### |" + "\n"
			       + "|                                   |" + "\n"
			       + "|                                   |" + "\n"
			       + "|                        Bill Gates |" + "\n"
			       + "|                   1 Microsoft Way |" + "\n"
			       + "|                 Redmond, WA 98104 |" + "\n"
			       + "|                                   |" + "\n"
			       + "+———————————————————————————————————+";   
		
		File fisier = new File("D:\\exercitii\\Ex3fisier.txt");
		fisier.createNewFile();
		FileWriter fw = new FileWriter(fisier);
		BufferedWriter bf = null;
		
		try {
			bf = new BufferedWriter(fw);
			bf.write(desen);
			bf.newLine();
			bf.write(desen);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			bf.close();
			fw.close();
		
		}
		
			
		

	}

}
