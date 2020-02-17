import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class Ksiazka {
	private String tytul;
	private String autor;
	private Vector<Tom> tomy = new Vector<Tom>();
	private static HashSet<Tom> wszystkieTomy = new HashSet<Tom>();
	private static ArrayList<Ksiazka> ksiazki = new ArrayList<Ksiazka>();
	
	public Ksiazka(String tytul, String autor) {
	        this.tytul = tytul;
	        this.autor = autor;
	        ksiazki.add(this);
	}
	public void dodajTom(Tom tom) throws Exception {
        if(!tomy.contains(tom)) {
            //czy ta czesc nie zostala dodana do jakiejs calosci
            if(wszystkieTomy.contains(tom)) {
                throw new Exception("Ten tom jest juz powiazany z książką!");
            } 
            tomy.add(tom);
            // Zapisuje na liscie wszystkich czesci zapobieganie wspoldzielniu czesci
            wszystkieTomy.add(tom);
        }
	}

	public static void usunKsiazke(Ksiazka ksiazkaDoSkasowania) {
        if(ksiazki.contains(ksiazkaDoSkasowania)) {
            ksiazki.remove(ksiazkaDoSkasowania); 
            // Usuwa tomy prypisane do tej ksiązki
            for(int i=0;i<ksiazkaDoSkasowania.tomy.size();i++) {
            	if(wszystkieTomy.contains(ksiazkaDoSkasowania.tomy.get(i))) {
                    wszystkieTomy.remove(ksiazkaDoSkasowania.tomy.get(i));
                }
            }
        }
        ksiazkaDoSkasowania.tomy.clear();
	}	
	
	public void usunTom(Tom tom) {
		if(this.tomy.contains(tom) && this.wszystkieTomy.contains(tom)) {
			this.tomy.remove(tom);
			this.wszystkieTomy.remove(tom);
			System.out.println("Tom: "+ tom.getNazwa() +" został usunięty \n" );
		}
	}
	
	public String toString() {
        String info = "Książka: " + tytul + "Autor: " + autor + "\n";
        
        for(Tom tom : tomy) {
            info += "Tom: "+ tom.getNazwa()+" Liczba stron: " + tom.getLiczbaStron() + "\n";
        } 
        return info;
    }	
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public static HashSet<Tom> getWszystkieTomy() {
		HashSet<Tom> kopia = new HashSet<Tom>();
		kopia.addAll(wszystkieTomy);
		return kopia;
	}
	
}
