package tasks1;

public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) gender + name.length();
		result = prime * result + email.length();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Author author = (Author) obj;
		if ((this.name.equals(author.getName())) && (this.email.equals(author.getEmail()))
				&& (this.gender == author.getGender()))
			return true;
		else
			return false;
	}
}
