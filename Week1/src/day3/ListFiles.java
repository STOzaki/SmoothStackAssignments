package day3;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
//		File folder = new File("c://Users/salem/eclipse-workspace/SmoothStackAssignments/Week1/src/day3");
//		File[] listOfFiles = folder.listFiles();
//
//		for (int i = 0; i < listOfFiles.length; i++) {
//		  if (listOfFiles[i].isFile()) {
//		    System.out.println("File " + listOfFiles[i].getName());
//		  } else if (listOfFiles[i].isDirectory()) {
//		    System.out.println("Directory " + listOfFiles[i].getName());
//		  }
//		}
//	}
		String directoryName = "c://Users/salem/eclipse-workspace/SmoothStackAssignments/Week1/src/day3/TestDirectory";
		File dir = new File(directoryName);
		File[] listOfFiles = dir.listFiles();
		System.out.println("This is the list of all the names of the files in the " + directoryName);
		for(File file : listOfFiles) {
			System.out.println(file.getName());
		}
//		for(int i = 0; i < listOfFiles.length; i++) {
//			System.out.println(listOfFiles[i].getName());
//		}
	}
}
