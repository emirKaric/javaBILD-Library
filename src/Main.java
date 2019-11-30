public class Main {

	public static void printMeni() {
		System.out.println("\n\n=============== Library v1.0 ==================\n\n");
		System.out.println("1. Create an account");
		System.out.println("2. Delete account");
		System.out.println("3. Add book");
		System.out.println("4. Delete the book");
		System.out.println("5. Borrow a book");
		System.out.println("6. Print accounts");
		System.out.println("7. Exit");
	}
	
	public static void addAcount(Library library,java.util.Scanner input) {
		String firstName, lastName;
		System.out.println("Enter first name: ");
		firstName = input.next().trim();
		System.out.println("Enter last name: ");
		lastName = input.next().trim();
		library.addAccount(firstName, lastName);
	}
	
	public static void deleteAccount(Library library, java.util.Scanner input) {
		int accountIndex;
		System.out.println(library.toStringAccounts());
		System.out.println("Enter account index: ");
		accountIndex = input.nextInt();
		input.nextLine();
		library.deleteAccount(accountIndex);;
	}
	
	public static void addBook(Library library, java.util.Scanner input) {
		String name;
		System.out.println("Enter name of the book: ");
		name = input.nextLine().trim();
		library.addBook(name);
	}
	
	public static void deleteBook(Library library, java.util.Scanner input) {
		int bookIndex;
		System.out.println(library.toStringBooks());
		System.out.println("Enter book index: ");
		bookIndex = input.nextInt();
		input.nextLine();
		library.deleteBook(bookIndex);
	}
	
	public static void borrowBook(Library library, java.util.Scanner input) {
		int bookIndex;
		int accountIndex;
		System.out.println(library.toStringBooks());
		System.out.println("Enter book index: ");
		bookIndex = input.nextInt();
		input.nextLine();
		System.out.println("Enter your account index: ");
		accountIndex = input.nextInt();
		input.nextLine();
		library.borrowABook(accountIndex, bookIndex);
	}
	
	public static void printAccounts(Library library) {
		System.out.println(library.toStringAccounts());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		int meni;
		java.util.Scanner input = new java.util.Scanner(System.in);
	
		do {
			printMeni();
			meni = input.nextInt();
			input.nextLine().trim();
			switch (meni) {
			case 1:
				addAcount(library, input);
				break;
			case 2:
				deleteAccount(library, input);
				break;
			case 3:
				addBook(library, input);
				break;
			case 4:
				deleteBook(library, input);
				break;
			case 5:
				borrowBook(library, input);
				break;
			case 6:
				printAccounts(library);
				break;
			}
		} while (meni != 7);
		
		input.close();
	}
}