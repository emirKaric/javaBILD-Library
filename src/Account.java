public class Account implements Index {
	private static int _index; // Varijabla koja prati koliko ima racuna
	private final int index;
	private String firstName;
	private String lastName;
	private int numberOfBorrowedBooks;

	static {
		_index = 1;
	}


	public Account(String firstName, String lastName) {
		index = _index++;
		this.firstName = firstName;
		this.lastName = lastName;
		numberOfBorrowedBooks = 0;
	}

	public Account() {
		this(null,null);
	}

	public static int getLength() {
		return _index;
	}

	@Override
	public int getIndex() {
		return index;
	}

	public String getFirstName() {
		return getFirstName();
	}

	public void setFirsName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void increaseTheCounter() {
		++numberOfBorrowedBooks;
	}

	public void decreaseTheCounter() {
		--numberOfBorrowedBooks;
	}

	public int getNumberOfBorrowedBooks() {
		return numberOfBorrowedBooks;
	}

	public String toString() {
		return "\n\n========= " + index + " ==========\n\n" + "\nFirst name: " + firstName + "\nLast name: " + lastName
				+ "\nNumber of borrowed books: " + numberOfBorrowedBooks + "\n\n==================\n";
	}
}