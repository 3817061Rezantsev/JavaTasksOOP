package horstmannStructures;

public class Task9 {
	public static void main(String args[]) {
		String greeting = "Hello, World!";
		String location = greeting.substring(7, 13);
		String[] words = greeting.split("\\s");
		System.out.println(location == "World!");
		System.out.println(location.equals("World!"));
		System.out.println(words[1].trim() == "World!");
		System.out.println(words[1].trim().equals("World!"));
	}
}