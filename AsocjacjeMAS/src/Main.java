
public class Main {

	public static void main(String[] args) throws Exception {
// KOMPOZYCJA Jedna Książka - wiele tomów
		System.out.println("KOMPOZYCJA \n");
		Ksiazka k1 = new Ksiazka("Mistrz i Małgorzata", "Michaił Bułhakow"); //tworzę książkę
		Tom t1 = new Tom(k1,"T1", 107);
		Tom t2 = new Tom(k1,"T2", 234);
		Tom t3 = new Tom(k1,"T3", 162);
		k1.dodajTom(t1); //tworzę tom i łączę go z książką
		k1.dodajTom(t2); //tworzę i łączy kolejny tom
		k1.dodajTom(t3); //tworzę i łączy kolejny tom
		System.out.println(k1);
		Ksiazka k2 = new Ksiazka("Zbrodnia i kara", "Fiodor Dostojewski"); 
//		k2.dodajTom(Tom.utworzTom(k1, 107)); pojawi się błąd i nie doda częsci połączonej do innej całości	
		System.out.println(Ksiazka.getWszystkieTomy().size()+ " wyszstkie tomy size na początku \n"); //ilość tomów
		k1.usunTom(t2);
		System.out.println(Ksiazka.getWszystkieTomy().size()+ " wyszstkie tomy size po usunięciu t2 \n"); //ilośc tomów po usunięciu
		Ksiazka.usunKsiazke(k1);//usuwa książkę i wszystkie tomy do niej połączone
		System.out.println(Ksiazka.getWszystkieTomy().size()+ " wyszstkie tomy size po usunięciu książki \n"); //ilośc tomów po usunięciu
		System.out.println("________________________________________________________________________ \n \n");
		
// ASOCJACJA Z ATRYBUTEM Wiele turystów - wilele krajów, atrybutem jest ilośc dni spędzonych w danym kraju	
		System.out.println("ASOCJACJA Z ATRYBUTEM \n");
		Turysta_AA turysta1 = new Turysta_AA("Janusz","Kowalski","Polak"); //tworze turystów
		Turysta_AA turysta2 = new Turysta_AA("Ilona", "Wepryk", "Ukrainka");
		Turysta_AA turysta3 = new Turysta_AA("Ricardo", "Barkco", "Włoch");		
		Kraj_AA kraj1 = new Kraj_AA("Hiszpania"); //tworze kraje
		Kraj_AA kraj2 = new Kraj_AA("Niemcy");
		Kraj_AA kraj3 = new Kraj_AA("Francja");		
		TurystaKraj_AA tk1 = new TurystaKraj_AA(turysta1,kraj1,10);	//łączenie za pomocą klasy TurystaKraj
		TurystaKraj_AA tk2 = new TurystaKraj_AA(turysta1,kraj2,20);	
		turysta2.dodajKraj(kraj1, 44); //łączenie za pomocą klasy Turysta
		kraj1.dodajTuryste(turysta3, 22); //łączenie za pomocą klasy Kraj
		turysta3.dodajKraj(kraj2, 8);
		kraj3.dodajTuryste(turysta2, 18);
		kraj1.wyswietlTurystow(); //wyświetlenie wszystkich tórystów danego kraju
		kraj2.wyswietlTurystow();
		kraj3.wyswietlTurystow();	
		turysta1.wyswietlKraje(); //wyświetlenie wszystkich odwiedzonych przez turystę krajów
		turysta2.wyswietlKraje();
		turysta3.wyswietlKraje();	
		//todo usuwanie asocjacji
		System.out.println("________________________________________________________________________ \n \n");
		
 // ASOCJACJA KWALIFIKOWANA - Kwalifikatorem jest numer paszportu
		System.out.println("ASOCJACJA KWALIFIKOWANA \n");
		Kraj_AK kraj11 = new Kraj_AK("Hiszpania"); //Tworze kraje
		Kraj_AK kraj22 = new Kraj_AK("Izrael");
		Kraj_AK kraj33 = new Kraj_AK("Niemcy");		 
		Turysta_AK turysta11 = new Turysta_AK("Janusz","Kowalski","Polak","AS1234"); //Tworze turystów
		Turysta_AK turysta22 = new Turysta_AK("Ilona", "Wepryk", "Ukrainka","QW1234");
		Turysta_AK turysta33 = new Turysta_AK("Ricardo", "Barkco", "Włoch","ZX1234");
		kraj11.dodajTuryste(turysta11); // Dodaję powiązania za pomocą metody z klasy Kraj
		kraj11.dodajTuryste(turysta22); 
		kraj22.dodajTuryste(turysta11);
		kraj33.dodajTuryste(turysta33);
		turysta33.dodajKraj(kraj11); // Dodaje powiązanie za pomocą metody klasy Turysta
		System.out.println(kraj11); //wyświetlam kraje
		System.out.println(kraj22);
		System.out.println(kraj33);
		System.out.println(turysta11); //wyświetlam turystów
		System.out.println(turysta22);
		System.out.println(turysta33);
		kraj11.usunTuryste(turysta22); //usuwam turystę z kraju
		System.out.println(kraj11); //ponownie wyświetlam turystów i kraje
		System.out.println(kraj22);
		System.out.println(kraj33);
		System.out.println(turysta11);
		System.out.println(turysta22);
		System.out.println(turysta33);
		System.out.print(kraj11.znajdzTurysteKwalif("AS1234") + " Poszukiwany turysta" +"\n"); //Za pomocą kwalifikatora szuka turystę, kwalifikator to nr paszportu
		System.out.println("________________________________________________________________________ \n \n");
			
 //ASOCJACJA BINARNA
		System.out.println("ASOCJACJA BINARNA \n");
		Kraj_AB kraj6 = new Kraj_AB("Hiszpania"); //tworzę obiekty
		Kraj_AB kraj7 = new Kraj_AB("Izrael");
		Kraj_AB kraj8 = new Kraj_AB("Niemcy");
		Turysta_AB turysta6 = new Turysta_AB("Janusz","Kowalski","Polak");
		Turysta_AB turysta7 = new Turysta_AB("Ilona", "Wepryk", "Ukrainka");
		Turysta_AB turysta8 = new Turysta_AB("Ricardo", "Barkco", "Włoch");
		kraj6.dodajTuryste(turysta6); // powiązanie za pomocą metody z klasy Kraj
		kraj7.dodajTuryste(turysta7);	
		turysta8.dodajKraj(kraj8); // powiązanie za pomocą metody z klasy Turysta
		System.out.println(kraj6);
		System.out.println(kraj7);
		System.out.println(kraj8);
		System.out.println(turysta6);
		System.out.println(turysta7);
		System.out.println(turysta8);
		kraj7.usunTuryste(turysta7); //usuwam turystę z kraju
		turysta6.usunKraj(kraj6); //usuwam kraj z listy turysty
		System.out.println(kraj6);
		System.out.println(kraj7);
		System.out.println(kraj8);
		System.out.println(turysta6);
		System.out.println(turysta7);
		System.out.println(turysta8);
		
		System.out.println("________________________________________________________________________ \n \n");
	}
		

}
