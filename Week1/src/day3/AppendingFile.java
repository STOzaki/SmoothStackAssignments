package day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class AppendingFile {
	public static void main(String[] args) {
		File file = new File("c://Users/salem/eclipse-workspace/SmoothStackAssignments/Week1/src/day3/AppendableFile.txt");
		try {
			FileWriter fr = new FileWriter(file, true);
			fr.write("data");
			fr.close();
			System.out.println("Finished Appending.");
		} catch (IOException e) {
			System.out.println("Error in trying to access the file.");
		}
		
	}
}
