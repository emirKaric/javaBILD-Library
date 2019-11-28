import java.util.Date;

public class BorrowedBook {
	private final int indexKorisnika;
	private final int indexKnjige;
	private Date datumDizanja;
	
	public PodignutaKnjiga(){
		indexKorisnika = 1;
		indexKnjige = 1;
		datumDizanja = new Date();
	}
	
	public PodignutaKnjiga(int indexKorisnika, int indexKnjige, Date datumDizanja){
		this.indexKorisnika = indexKorisnika; 
		this.indexKnjige = indexKnjige;
		this.datumDizanja = datumDizanja;
	}
	
	public int getIndexKnjige() {
		return indexKnjige;
	}	
	
	public int getIndexKorisnika() {
		return indexKorisnika;
	}
	
	public Date getDatumDizanja() {
		return datumDizanja;
	}
	public String toString() {
		return "\n\n======================\n\n" + "\nIndex korisnika: " + indexKorisnika + "\nIndex knjige: " + indexKnjige
				+ "\n\n=====================\n";
	}
}
