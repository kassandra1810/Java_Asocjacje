import java.util.ArrayList;

public class Turysta_AB {
	private String imie;
	private String nazwisko;
	private String narodowosc;
	private ArrayList<Kraj_AB> kraj = new ArrayList<Kraj_AB>();
 
    public Turysta_AB(String imie, String nazwisko, String narodowosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.narodowosc = narodowosc;
    }
 
    public void dodajKraj(Kraj_AB nowyKraj) {
    	if(!kraj.contains(nowyKraj)) {
	    	kraj.add(nowyKraj);
	        //informacja zwrotna
	    	nowyKraj.dodajTuryste(this);
    	}
    }	
    public void usunKraj(Kraj_AB krajDoSkasowania) {
        if(kraj.contains(krajDoSkasowania)) {
            kraj.remove(krajDoSkasowania);
            // Usuwanie informacji zwrotnej
            krajDoSkasowania.usunTuryste(this);
            System.out.println(krajDoSkasowania + " został usunięty");
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
        String info = "Turysta: " + getImie() + " " + getNazwisko() + " Narodowość: " + getNarodowosc() + "\n"; 
	        for(Kraj_AB k : kraj) {
	            info += "   " + k.getNazwa() + "\n";
	        }
        return info;
    }
}
