import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E1 {

	public static void main(String[] args) {
		BufferedReader reader;
		int count = 0;
		try {
			reader = new BufferedReader(new FileReader(
					"monFichier.txt"));
			String line = reader.readLine();
			while (line != null) {
				char [] a = line.toCharArray();
				for (char i : a) {
					if (i == 'a') {
						count++;
					}
				}
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(count);
	}
}