import java.util.ArrayList;

public class Kraj_AB {
	private String nazwa;
	private ArrayList<Turysta_AB> turysta = new ArrayList<Turysta_AB>();
 
    public Kraj_AB(String nazwa) {
        this.nazwa = nazwa;
    }
 
    public void dodajTuryste(Turysta_AB nowyTurysta) {
    	if(!turysta.contains(nowyTurysta)) {
	    	turysta.add(nowyTurysta);
	        //informacja zwrotna
	    	nowyTurysta.dodajKraj(this);
    	}
    }
    
    public void usunTuryste(Turysta_AB turystaDoSkasowania) {
        if(turysta.contains(turystaDoSkasowania)) {
            turysta.remove(turystaDoSkasowania);
            // Usun informacje zwrotna
            turystaDoSkasowania.usunKraj(this);
            System.out.println(turystaDoSkasowania + " został usunięty");
        }
    }
 
    public String toString() {
        String info = "Kraj: " + getNazwa() + "\n"; 
	        for(Turysta_AB t : turysta) {
	            info += "   " + t.getImie() +"   " + t.getNazwisko()+ "   " + t.getNarodowosc() + "\n";
	        }
        return info;
    }
	
    public String getNazwa() {
    	return this.nazwa;
    }

}

