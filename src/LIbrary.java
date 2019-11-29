import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

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
	
		public String posudiKnjigu(int accountIndex, int bookIndex, Date date) {
			Account account = (Account) getReference(accounts, 0, accounts.size(), accountIndex );
			Book book = (Book) getReference(books, 0, books.size(), bookIndex);

			if (provjeraKnjiga(knjiga)) {
				return "Nije moguce dodati knjigu sa ovim indexom";
			}

			if (provjeraKorisnika(korisnik)) {
				return "Nije moguce dodati korisnika sa ovim indexom";
			}

			knjiga.setStatusKnjige(true);
			korisnik.uvecajBrojKnjiga();

			for (int i = 0; i < podignuteKnjige.length; i++) {
				if (podignuteKnjige[i] == null) {
					podignuteKnjige[i] = new PodignutaKnjiga(indexKorisnika, indexKnjige, datum);
					return "Knjiga posudjena";
				}
			}

			int temp = podignuteKnjige.length;
			podignuteKnjige = Alociraj(podignuteKnjige);
			podignuteKnjige[temp] = new PodignutaKnjiga(indexKorisnika, indexKnjige, datum);
			return "Knjiga posudjena";
		}

		public String vratiKnjigu(int indexKnjige) {
			for (int i = 0; i < podignuteKnjige.length; i++) {
				if (podignuteKnjige[i] != null) {
					if (podignuteKnjige[i].getIndexKnjige() == indexKnjige) {
						((Racun) vratiReferencu(podignuteKnjige[i].getIndexKorisnika(), korisnickiRacuni))
								.smanjiBrojKnjiga();
						((Knjiga) vratiReferencu(indexKnjige, knjigeUBiblioteci)).setStatusKnjige(false);
						podignuteKnjige[i] = null;
						return "Knjiga vracena ";
					}
				}
			}
			return "Greska u vracanju knjige";
		}

		public void dodajKorisnika(String ime, String prezime) {
			for (int i = 0; i < korisnickiRacuni.length; i++) {
				if (korisnickiRacuni[i] == null) {
					korisnickiRacuni[i] = new Racun(ime, prezime);
					return;
				}
			}
			int temp = korisnickiRacuni.length;
			korisnickiRacuni = Alociraj(korisnickiRacuni);
			korisnickiRacuni[temp] = new Racun(ime, prezime);
		}

		public void dodajKnjigu(String naziv) {
			for (int i = 0; i < knjigeUBiblioteci.length; i++) {
				if (knjigeUBiblioteci[i] == null) {
					knjigeUBiblioteci[i] = new Knjiga(naziv);
					return;
				}
			}

			int temp = knjigeUBiblioteci.length;
			knjigeUBiblioteci = Alociraj(knjigeUBiblioteci);
			knjigeUBiblioteci[temp] = new Knjiga(naziv);
		}
		
		public String toStringAll() {
			StringBuffer string = new StringBuffer();
			string.append("Ukupan broj korisnika koji su zatrazili usluge biblioteke: " + Racun.getLength());
			string.append("\nUkupan broj knjiga koje su dodane u biblioteku: " + Knjiga.getLength());
			for (int i = 0; i < knjigeUBiblioteci.length; i++) {
				if (knjigeUBiblioteci[i] != null)
					string.append(knjigeUBiblioteci[i]);
			}
			
		}
}
