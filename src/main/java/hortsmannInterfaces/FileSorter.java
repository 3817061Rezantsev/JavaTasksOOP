package hortsmannInterfaces;

import java.io.File;
import java.text.Collator;
import java.util.Arrays;
import java.util.regex.Pattern;

public class FileSorter {
	Pattern p = null;
	Collator collator = null;

	public FileSorter() {
		String separator = File.separator;
		if (separator.equals("\\")) {
			separator = "\\";
		}
		p = Pattern.compile(separator, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
	}

	public File[] sort(File[] fileList) {
		File[] files = fileList;
		Arrays.sort(files, (o1, o2) -> {
			String fullPath1 = o1.getAbsolutePath();
			String fullPath2 = o2.getAbsolutePath();
			if (fullPath1.equals(fullPath2)) {
				return 0;
			}
			String[] res1 = p.split(fullPath1);
			String[] res2 = p.split(fullPath2);
			if (res1.length > res2.length) {
				return 1;
			}
			if (res1.length < res2.length) {
				return -1;
			}
			if (res1.length == res2.length) {
				return fullPath1.compareTo(fullPath2);
			}
			return 0;
		});
		return files;
	}

}
