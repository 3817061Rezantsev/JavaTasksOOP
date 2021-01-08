package hortsmannInterfaces;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String directory = in.next();
		File file = new File(directory);
		File[] files = file.listFiles(File::isDirectory);
		for (File f : files) {
			System.out.println(f.getName());
		}
		files = file.listFiles((f) -> {
			return f.isDirectory();
		});
		for (File f : files) {
			System.out.println(f.getName());
		}

		files = file.listFiles(new FileFilter() {
			public boolean accept(File f) {
				return f.isDirectory();
			}
		});
		for (File f : files) {
			System.out.println(f.getName());
		}
	}
}
