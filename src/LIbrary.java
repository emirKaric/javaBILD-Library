public class LIbrary {
	
		private ArrayList<Racun> korisnickiRacuni;
		private ArrayList<Knjiga> knjigeUBiblioteci;
		private ArrayList<PodignutaKnjiga> podignuteKnjige;
		
		/* Prepraviti dio koda implementirat bolji Algoritam za pretrazivanje */
		private <E> Index vratiReferencu(ArrayList<Index> object, int left, int right, int index) {

	        if (right >= left) { 
	            int middle = left + (right - left) / 2; 
	  
	            // If the element is present at the 
	            // middle itself 
	            if (object.get(middle).getIndex() == index) 
	                return object.get(middle); 
	  
	            // If element is smaller than mid, then 
	            // it can only be present in left subarray 
	            if (object.get(middle).getIndex() > index) 
	                return vratiReferencu(object, left, middle - 1, index); 
	            // Else the element can only be present 
	            // in right subarray 
	            return binarySearch(object, mid + 1, r, x); 
	        } 
	  
	        // We reach here when element is not present 
	        // in array 
			return null;
		}
		
		public Biblioteka() {
			korisnickiRacuni = new ArrayList<Racun>();
			knjigeUBiblioteci = new ArrayList<Knjiga>();
			podignuteKnjige = new ArrayList<PodignutaKnjiga>();
		}

		public String posudiKnjigu(int indexKorisnika, int indexKnjige, Date datum) {
			Racun korisnik = (Racun) vratiReferencu(indexKorisnika, korisnickiRacuni);
			Knjiga knjiga = (Knjiga) vratiReferencu(indexKnjige, knjigeUBiblioteci);

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
