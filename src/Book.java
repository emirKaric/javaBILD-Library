public class Book {
	private static int _index; // Varijabla koja prati koliko ima knjiga
	private final int index;
	private String naziv;
	private boolean statusKnjige; // Da li je podignuta ili ne

	static {
		_index = 1;
	}

	Knjiga() {
		index = _index++;
		naziv = "Nepoznato";
		statusKnjige = false;
	}

	Knjiga(String naziv) {
		index = _index++;
		this.naziv = naziv;
		statusKnjige = false;
	}

	public static int getLength() {
		return _index;
	}

	@Override
	public int getIndex() {
		return index;
	}

	public boolean getStatusKnjige() {
		return statusKnjige;
	}

	public void setStatusKnjige(boolean statusKnjige) {
		this.statusKnjige = statusKnjige;
	}

	public String getNaziv() {
		return naziv;
	}

	public String toString() {
		return "\n\n========= " + index + " ==========\n\n" + "\nNaziv: " + naziv + "\nDa li je knjiga podignuta: "
				+ statusKnjige + "\n\n==================\n";
	}
}