package Ex2;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(new FileInputStream("D:\\exercitii\\Ex1fisier.txt"));
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\exercitii\\Ex2fisier.txt"));
		
		String count;
        while ((count = in.readLine()) != null) {
            String u = count.toUpperCase();
            System.out.println(u);
            out.writeChars(u);
        }
        in.close();
        out.close();
	}

}
