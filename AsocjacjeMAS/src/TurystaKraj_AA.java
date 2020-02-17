
import java.util.ArrayList;

public class TurystaKraj_AA {
	private int iloscDni;
	private Turysta_AA turysta;
	private Kraj_AA kraj;
	private static ArrayList<TurystaKraj_AA> TurystaKraj_AA = new ArrayList<TurystaKraj_AA>();
	
    public TurystaKraj_AA(Turysta_AA nowyTurysta, Kraj_AA nowyKraj,int iloscDni ) {
    	this.turysta = nowyTurysta;
    	this.kraj = nowyKraj;
    	this.setIloscDni(iloscDni);
    	TurystaKraj_AA.add(this);
    	nowyTurysta.setTurystaKraj(this);
    	nowyKraj.setTurystaKraj(this);
    }
    public String getImie() {
    	return turysta.getImie();
    }    
    public String getNazwisko() {
    	return turysta.getNazwisko();
    }
    public String getNarodowosc() {
    	return turysta.getNarodowosc();
    }	
    public String getNazwa() {
    	return kraj.getNazwa();
    }
    
    public String toString() {
        String info = "Turysta: " + getImie() + " " + getNazwisko() + " Narodowość: " + getNarodowosc() + "\n"; 
	    info += "Kraj:  " + kraj.getNazwa() + "\n";
	    info += "Ilość dni: " + this.iloscDni + "\n";
        return info;
    }
    
   
	public int getIloscDni() {
		return iloscDni;
	}
	public void setIloscDni(int iloscDni) {
		this.iloscDni = iloscDni;
	}
	public static ArrayList<TurystaKraj_AA> getListaTurKraj() {
		ArrayList<TurystaKraj_AA> copy = new ArrayList<TurystaKraj_AA>();
		copy.addAll(TurystaKraj_AA);
		return copy;
	}
	public Turysta_AA getTurysta() {
		return turysta;
	}
	public void setTurysta(Turysta_AA turysta) {
		if(turysta != null) {
			this.turysta = turysta;
		}
	}	
	public Kraj_AA getKraj() {
		return kraj;
	}
	public void setKraj(Kraj_AA kraj) {
		if (kraj != null) {
			this.kraj = kraj;
		}
	}	

}
