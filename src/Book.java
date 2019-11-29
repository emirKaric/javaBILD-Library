public class Book implements Index {
	private static int _index; // Varijabla koja prati koliko ima knjiga
	private final int index;
	private String name;
	private boolean bookStatus; // Da li je podignuta ili ne

	static {
		_index = 1;
	}

	Book(String name) {
		index = _index++;
		this.name = name;
		bookStatus = false;
	}

	Book() {
		this(null);
	}

	public static int getLength() {
		return _index;
	}

	@Override
	public int getIndex() {
		return index;
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
		return "\n\n========= " + index + " ==========\n\n" + "\nName: " + name + "\nIs book borrowed: "
				+ bookStatus + "\n\n==================\n";
	}
}