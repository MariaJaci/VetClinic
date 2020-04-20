import java.util.ArrayList;
import java.util.Random;

final class HumanNames {
	
	private ArrayList <String> namesList  = new ArrayList <String>();

	public HumanNames(){
		this.namesList.add("Maria");
		this.namesList.add("Niam");
		this.namesList.add("Jaciara");
		this.namesList.add("Naiady");
		this.namesList.add("Gabriela");
		this.namesList.add("Kate");
		this.namesList.add("Mary");
		this.namesList.add("Bram");
		this.namesList.add("Edgar");
		this.namesList.add("Hillary");
		this.namesList.add("Julie");
		this.namesList.add("Kathleen");
		this.namesList.add("Carol");
		this.namesList.add("Luca");
		this.namesList.add("John");
		this.namesList.add("Paul");
		this.namesList.add("Madonna");
		this.namesList.add("Addie");
		this.namesList.add("Kurt");
		this.namesList.add("Kris");
		this.namesList.add("Alannis");
		this.namesList.add("George");
		this.namesList.add("Ringo");
		this.namesList.add("Ozzy");
		this.namesList.add("Amilcar");
		this.namesList.add("Ken");

	}
		//method to have random names 
		public String getRandomname() {

		int listSize = this.namesList.size();
		Random r = new Random();
		int indexOfNames = r.nextInt(listSize);
		
		String randomNames = this.namesList.get(indexOfNames);
		return randomNames;


			
		}
		
	}


