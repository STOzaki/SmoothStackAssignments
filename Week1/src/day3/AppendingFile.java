package day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class AppendingFile {
	public static void main(String[] args) {
		File file = new File("src/day3/AppendableFile.txt");
		String data = (args.length > 0) ? args[0]: "";
		try {
			FileWriter fr = new FileWriter(file, true);
			fr.write(data);
			fr.close();
			if(data.isEmpty()) {
				System.out.println("The data you wanted to add was blank");
			} else {
				System.out.println("Finished Appending.");
			}
			
		} catch (IOException e) {
			System.out.println("Error in trying to access the file.");
		}
		
	}
}
