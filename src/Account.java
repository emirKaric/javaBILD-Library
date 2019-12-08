public class Account implements ObjectId {
	private static int numberOfObjects; // Varijabla koja prati koliko ima racuna
	private final int accountID;
	private String firstName;
	private String lastName;
	private int numberOfBorrowedBooks;

	static {
		numberOfObjects = 1;
	}


	public Account(String firstName, String lastName) {
		accountID = numberOfObjects++;
		this.firstName = firstName;
		this.lastName = lastName;
		numberOfBorrowedBooks = 0;
	}

	public Account() {
		this(null,null);
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	@Override
	public int getID() {
		return accountID;
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

	public void decreaseTheCounter(){
		--numberOfBorrowedBooks;
	}

	public int getNumberOfBorrowedBooks() {
		return numberOfBorrowedBooks;
	}

	public String toString() {
		return "\n\n========= " + accountID + " ==========\n\n" + "\nFirst name: " + firstName + "\nLast name: " + lastName
				+ "\nNumber of borrowed books: " + numberOfBorrowedBooks + "\n\n==================\n";
	}
}