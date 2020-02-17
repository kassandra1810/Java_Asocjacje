import java.util.ArrayList;

public class Turysta_AA {
	
	private String imie;
	private String nazwisko;
	private String narodowosc;
	private ArrayList<TurystaKraj_AA> turystaKraj = new ArrayList<TurystaKraj_AA>();
 
    public Turysta_AA(String imie, String nazwisko, String narodowosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.narodowosc = narodowosc;
    }
    
    public void dodajKraj(Kraj_AA kraj, int iloscDni) {
    	if (kraj != null) {
	    	new TurystaKraj_AA(this, kraj, iloscDni);
/*	    	kraj.setTurysta(this);
	    	kraj.setKraj(kraj);*/
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

	public ArrayList<TurystaKraj_AA> getTurystaKraj() {
		ArrayList<TurystaKraj_AA> kopia = (ArrayList<TurystaKraj_AA>) turystaKraj.clone();
		return kopia;
	}
	public void setTurystaKraj(TurystaKraj_AA b) {
		if (b != null) {
			this.turystaKraj.add(b);
		}
	}
	
	public void wyswietlKraje() {
		if (turystaKraj.size() > 0) {
			System.out.println(this.imie + " " + this.nazwisko+ " " + this.narodowosc);
			for (int i=0; i<turystaKraj.size();i++) {
				System.out.println(this.turystaKraj.get(i).getKraj()+" Ilość dni: " + turystaKraj.get(i).getIloscDni());
			}
			System.out.println( "\n");
		} else {
			System.out.println(this.imie + " " + this.nazwisko+ " " + this.narodowosc);
			System.out.println("0");
		}
		
	}

	public void setTurystaKraj(Kraj_AA kraj) {
		// TODO Auto-generated method stub
		
	}

	public void setTurysta(Turysta_AA turysta) {
		// TODO Auto-generated method stub
		
	}

	public void setKraj(Kraj_AA kraj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Turysta imie: " + imie + ", nazwisko: " + nazwisko + ", narodowosc: " + narodowosc;
	}
	
	
    
    

}
