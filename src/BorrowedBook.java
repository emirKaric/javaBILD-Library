import java.util.Date;

public class BorrowedBook {
	private final int accountIndex;
	private final int bookIndex;
	private Date dateOfBorrowing;
	
	
	public BorrowedBook(int accountIndex, int bookIndex){
		this.accountIndex = accountIndex; 
		this.bookIndex = bookIndex;
		this.dateOfBorrowing = new Date();
	}
	public BorrowedBook() {
		this(0,0);
	}
	
	public int getAccountIndex() {
		return accountIndex;
	}	
	
	public int getBookIndex() {
		return bookIndex;
	}
	
	public Date getDateOfBorrowing() {
		return dateOfBorrowing;
	}
	public String toString() {
		return "\n\n======================\n\n" + "\nAccount index: " + accountIndex + "\nBook index: " + bookIndex
				+ "\n\n=====================\n";
	}
}