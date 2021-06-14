import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;



public class E2 {

	public static void main(String[] args) {
		
		
		try {
			BufferedReader reader;
			Writer output;
			String o = "";
			output = new BufferedWriter(new FileWriter("monResultat.txt"));
			reader = new BufferedReader(new FileReader("monFichier.txt"));
			String line = reader.readLine();
			while (line != null) {
				int b = 0;
				char [] lineA = line.toCharArray();
				for (char a : lineA) {
					if (a != ' ') {
						b++;
					}
				}
				
				o += b + "/n";
			}
			output.append(o);
			System.out.print(o);
			output.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}