public class Book implements ObjectId {
	private static int numberOfObjects; // Varijabla koja prati koliko ima knjiga
	private final int bookID;
	private String name;
	private boolean bookStatus; // Da li je podignuta ili ne

	static {
		numberOfObjects = 1;
	}

	Book(String name) {
		this.bookID = numberOfObjects++;
		this.name = name;
		this.bookStatus = false;
	}

	Book() {
		this(null);
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	@Override
	public int getID() {
		return bookID;
	}

	public boolean getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(boolean bookStatus) {
		this.bookStatus = bookStatus;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "\n\n========= " + bookID + " ==========\n\n" + "\nName: " + name + "\nIs book borrowed: "
				+ bookStatus + "\n\n==================\n";
	}
}