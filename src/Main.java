public class Main {

	public static void printMeni() {
		System.out.println("\n\n=============== BIBLIOTEKA v1.0 ==================\n\n");
		System.out.println("1. Kreiraj racun");
		System.out.println("2. Dodaj knjigu");
		System.out.println("3. Podizanje knjige");
		System.out.println("4. Ispisivanje racuna");
		System.out.println("5. Exit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int meni;
		java.util.Scanner unos = new java.util.Scanner(System.in);
		do {
			printMeni();
			meni = unos.nextInt();
			switch (meni) {
			case 1:
				
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			}

		} while (meni != 5);
	}
}