import java.util.ArrayList;

public class Library {
	
		private ArrayList<Account> accounts;
		private ArrayList<Book> books;
		private ArrayList<BorrowedBook> borrowedBooks;
		
		/* Prepraviti dio koda implementirat bolji Algoritam za pretrazivanje */
		
		private Index getReference(ArrayList<? extends Index> object, int left, int right, int index) {

	        if (right >= left) { 
	            int middle = left + (right - left) / 2; 
	  
	            // If the element is present at the 
	            // middle itself 
	            if (object.get(middle).getIndex() == index) 
	                return object.get(middle); 
	  
	            // If element is smaller than mid, then 
	            // it can only be present in left subarray 
	            if (object.get(middle).getIndex() > index) 
	                return getReference(object, left, middle - 1, index); 
	            // Else the element can only be present 
	            // in right subarray 
	            return getReference(object, middle + 1, right, index); 
	        } 
	  
	        // We reach here when element is not present 
	        // in array 
			return null;
		}
		
		
		public Library() {
			accounts = new ArrayList<Account>();
			books = new ArrayList<Book>();
			borrowedBooks = new ArrayList<BorrowedBook>();
		}
	
		public void BorrowABook(int accountIndex, int bookIndex) {
			Account account = (Account) getReference(accounts, 0, accounts.size(), accountIndex);
			Book book = (Book) getReference(books, 0, books.size(), bookIndex);

			if (book.getBookStatus()) {
				return;
			}

			if (account.getNumberOfBorrowedBooks() >= 3) {
				return;
			}

			book.setBookStatus(true);
			account.increaseTheCounter();
			
			borrowedBooks.add(new BorrowedBook(accountIndex,bookIndex));
			
			return;
		}

		public void vratiKnjigu(int bookIndex) {
			for (int i = 0; i < borrowedBooks.size(); i++) {
					if (borrowedBooks.get(i).getBookIndex() == bookIndex) {
						((Account) getReference(accounts, 0, accounts.size(), borrowedBooks.get(i).getAccountIndex())).decreaseTheCounter();
						((Book) getReference(books, 0, books.size(), bookIndex)).setBookStatus(false);
						borrowedBooks.remove(i);
						return;
				}
			}
			return;
		}

		public void dodajKorisnika(String firstName, String lastName) {
			accounts.add(new Account(firstName, lastName));
		}

		public void dodajKnjigu(String name) {
			books.add(new Book(name));
		}
		
		public String toStringAll() {
			StringBuffer string = new StringBuffer();
			string.append("");
			for (int i = 0; i < accounts.size(); i++) {
				string.append(accounts.get(i).toString());
			}
			return string.toString();
		}
}