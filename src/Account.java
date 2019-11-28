public class Account {
	private static int _index; // Varijabla koja prati koliko ima racuna
	private final int index;
	private String ime;
	private String prezime;
	private int brojPosudjenihKnjiga;

	static {
		_index = 1;
	}

	public Racun() {
		index = _index++;
		ime = "Nepoznato";
		prezime = "Nepoznato";
		brojPosudjenihKnjiga = 0;
	}

	public Racun(String ime, String prezime) {
		index = _index++;
		this.ime = ime;
		this.prezime = prezime;
		brojPosudjenihKnjiga = 0;
	}

	public static int getLength() {
		return _index;
	}

	@Override
	public int getIndex() {
		return index;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public boolean uvecajBrojKnjiga() {
		if (brojPosudjenihKnjiga + 1 <= 3) {
			++brojPosudjenihKnjiga;
			return true;
		}
		return false;
	}

	public void smanjiBrojKnjiga() {
		if (brojPosudjenihKnjiga - 1 < 0) {
			return;
		}
		--brojPosudjenihKnjiga;
	}

	public int getBrojPosudjenihKnjiga() {
		return brojPosudjenihKnjiga;
	}

	public String toString() {
		return "\n\n========= " + index + " ==========\n\n" + "\nIme: " + ime + "\nPrezime: " + prezime
				+ "\nBroj posudjenih knjiga: " + brojPosudjenihKnjiga + "\n\n==================\n";
}
