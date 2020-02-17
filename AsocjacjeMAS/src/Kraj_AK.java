
import java.util.Map;
import java.util.TreeMap;

public class Kraj_AK {
	private String nazwa;
    public Kraj_AK(String nazwa) {
        this.setNazwa(nazwa);
    }
	private TreeMap<String, Turysta_AK> turystaKwalif = new TreeMap<String, Turysta_AK>();
	
    public void dodajTuryste(Turysta_AK nowyTurysta) {
        // Sprawdza czy nie mamy juz informacji o tym turyście
        if(!turystaKwalif.containsKey(nowyTurysta.getNrPaszportu())) {
            turystaKwalif.put(nowyTurysta.getNrPaszportu(), nowyTurysta);
            // Dodaje informację zwrotną
            nowyTurysta.dodajKraj(this);
        }
    }
    
    public void usunTuryste(Turysta_AK turystaDoSkasowania) {
        if(turystaKwalif.containsKey(turystaDoSkasowania.getNrPaszportu())) {
        	turystaKwalif.remove(turystaDoSkasowania.getNrPaszportu()); 	
            // Usunwam informacje zwrotną
            turystaDoSkasowania.usunKraj(this);
            System.out.println("Turysta "+ turystaDoSkasowania + "został usunięty"+ "\n");
        }
    }
    
    public Turysta_AK znajdzTurysteKwalif(String nrPaszportu) throws Exception {
        // Sprawdza czy nie mamy juz informacji o tym turyscie
        if(!turystaKwalif.containsKey(nrPaszportu)) {
            throw new Exception("Nie odnaleziono turysty z numerem paszportu: " + nrPaszportu);
        }
        return turystaKwalif.get(nrPaszportu);
    }
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
    public String toString() {
        String info = "Kraj: " + getNazwa() + "\n"; 
        for (Map.Entry<String, Turysta_AK> entry : turystaKwalif.entrySet()) {
            info += "Value: " + entry.getValue().getImie()+" "+ entry.getValue().getNazwisko()+" " + entry.getValue().nrPaszportu + "\n";
        }
        return info;
    }
    
}

