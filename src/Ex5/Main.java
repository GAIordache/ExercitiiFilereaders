package Ex5;
import java.io.*;
import java.nio.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un nr random");
		Integer nrUser = sc.nextInt();
		System.out.println("Introduceti-va numele");
		String numeUser = sc.next();
		
		File f = new File("D:\\exercitii\\ex5fisier.txt");
		
		try {
			f.createNewFile();
			
		} catch(IOException i) {
			i.printStackTrace();
		}
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String txt = br.readLine();
			if (txt == null) {
				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				bw.write(nrUser.toString());
				bw.write(" " + numeUser);
			}else {
				Scanner fisierContent = new Scanner(f);
				String s = fisierContent.next();
				int nr = Integer.parseInt(s);
				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				if(nr< nrUser) {
					bw.write(nrUser.toString());
					bw.write(" " + numeUser);
				}else {
					bw.write("" + nr);
					bw.write(" " + numeUser);
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				bw.close();
			}
			if(fw != null) {
				fw.close();
			}
			if(br != null) {
				br.close();
			}
			if(fr != null) {
				fr.close();
			}
			
		}
		
		
		
	}

}
