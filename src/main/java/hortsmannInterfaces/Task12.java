package hortsmannInterfaces;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Task12 {

	public static ArrayList<File> listFiles(String extension, String directory) {
		File file = new File(directory);
		String[] fileNames = file.list((dir, name) -> {
			return name.endsWith(extension);
		});
		ArrayList<File> files = new ArrayList<>();
		for (String fileName : fileNames) {
			files.add(new File(fileName));
		}
		return files;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String extension = in.next();
		String directory = in.next();
		ArrayList<File> files = listFiles(extension, directory);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}
// Which variable from the enclosing scope does it capture? extension