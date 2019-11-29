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
		this.firstName = lastName;
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

	public void setIme(String firstName) {
		this.firstName = firstName;
	}

	public String getPrezime() {
		return lastName;
	}

	public void setPrezime(String lastName) {
		this.lastName = lastName;
	}

	public void uvecajBrojKnjiga() {
		++numberOfBorrowedBooks;
	}

	public void smanjiBrojKnjiga() {
		--numberOfBorrowedBooks;
	}

	public int getBrojPosudjenihKnjiga() {
		return numberOfBorrowedBooks;
	}

	public String toString() {
		return "\n\n========= " + index + " ==========\n\n" + "\nFirst name: " + firstName + "\nLast name: " + lastName
				+ "\nNumber of borrowed books: " + numberOfBorrowedBooks + "\n\n==================\n";
	}
}