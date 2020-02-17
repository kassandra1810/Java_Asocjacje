
public class Tom {
	private int liczbaStron;
	private Ksiazka ksiazka;
	private String nazwa;
	
    public Tom(Ksiazka ksiazka, String nazwa, int liczbaStron) {
        this.liczbaStron = liczbaStron;
        this.setNazwa(nazwa);
        this.setKsiazka(ksiazka);
        if(ksiazka == null) {
            try {
				throw new Exception("Książka nie istnieje!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
 
        // Dodaj do calosci
        try {
			ksiazka.dodajTom(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	public int getLiczbaStron() {
		return liczbaStron;
	}

	public void setLiczbaStron(int liczbaStron) {
		this.liczbaStron = liczbaStron;
	}

	public Ksiazka getKsiazka() {
		return ksiazka;
	}

	public void setKsiazka(Ksiazka ksiazka) {
		this.ksiazka = ksiazka;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
}
