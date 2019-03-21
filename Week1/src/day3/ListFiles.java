package day3;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		String directoryName = "src/day3/TestDirectory";
		File dir = new File(directoryName);
		File[] listOfFiles = dir.listFiles();
		System.out.println("This is the list of all the names of the files in the " + directoryName);
		for(File file : listOfFiles) {
			System.out.println(file.getName());
		}
	}
}
