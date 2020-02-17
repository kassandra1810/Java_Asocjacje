import java.util.ArrayList;

public class Turysta_AK {
	private String imie;
	private String nazwisko;
	private String narodowosc;
	public String nrPaszportu;
	private ArrayList<Kraj_AK> kraj = new ArrayList<Kraj_AK>();
 
    public Turysta_AK(String imie, String nazwisko, String narodowosc, String nrPaszportu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.narodowosc = narodowosc;
        this.nrPaszportu = nrPaszportu;
    }
 
    public void dodajKraj(Kraj_AK nowyKraj) {
    	if(!kraj.contains(nowyKraj)) {
	    	kraj.add(nowyKraj);
	        //informacja zwrotna
	    	nowyKraj.dodajTuryste(this);
    	}
    }	
    
    public void usunKraj(Kraj_AK krajDoSkasowania) {
        if(kraj.contains(krajDoSkasowania)) {
            kraj.remove(krajDoSkasowania);
            // Usun informacje zwrotna
            krajDoSkasowania.usunTuryste(this);
        }
    }
    
    public String getImie() {
    	return this.imie;
    }
    
    public String getNazwisko() {
    	return this.nazwisko;
    }
    public String getNarodowosc() {
    	return this.narodowosc;
    }
    
    public String toString() {
        String info = "Turysta: " + getImie() + " " + getNazwisko() + " Narodowość: " + getNarodowosc() + " Numer paszportu: " + getNrPaszportu() + "\n"; 
	        for(Kraj_AK k : kraj) {
	            info += "   " + k.getNazwa() + "\n";
	        }
        return info;
    }

	public String getNrPaszportu() {
		return nrPaszportu;
	}

	public void setNrPaszportu(String nrPaszportu) {
		this.nrPaszportu = nrPaszportu;
	}

	
}

