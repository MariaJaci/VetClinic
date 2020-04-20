import java.util.ArrayList;
import java.util.Random;

//definition of class HumanSurnames
final class HumanSurnames {
	//arraylist to store the surnames
	private ArrayList <String> surnameList  = new ArrayList <String>();
	
	// method to add all the surnames to the list
	public HumanSurnames() {
		this.surnameList.add("Smith");
		this.surnameList.add("Johnson");
		this.surnameList.add("Starr");
		this.surnameList.add("Harrison");
		this.surnameList.add("Osbourne");
		this.surnameList.add("McCartney");
		this.surnameList.add("Lennon");
		this.surnameList.add("Cobain");
		this.surnameList.add("Morrisset");
		this.surnameList.add("Gibson");
		this.surnameList.add("Novaselic");
		this.surnameList.add("Vedder");
		this.surnameList.add("Longo");
		this.surnameList.add("Lagares");
		this.surnameList.add("Moraes");
		this.surnameList.add("Silva");
		this.surnameList.add("Pereira");
		this.surnameList.add("Bolsonaro");
		this.surnameList.add("Trump");
		this.surnameList.add("Clinton");
		this.surnameList.add("Orwel");
		this.surnameList.add("Byron");
		this.surnameList.add("Poe");
		this.surnameList.add("Stocker");
		this.surnameList.add("Healy");
		this.surnameList.add("Aponte");

		
	}
	
	public String getRandomSurname() {
		int listSize = this.surnameList.size();
		Random r = new Random();	//instantiation of class Random
		int indexOfSurname = r.nextInt(listSize); //generate random number (max listSize)
		
		//get the surname in position indexOfSurname
		String randomSurname = this.surnameList.get(indexOfSurname);
		return randomSurname;
	}

}
