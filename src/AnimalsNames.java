import java.util.ArrayList;
import java.util.Random;

final class AnimalsNames {
	
	private ArrayList <String> animalsNamesList  = new ArrayList <String>();

	
	public AnimalsNames() {
		this.animalsNamesList.add("Flufy");
		this.animalsNamesList.add("Lessie");
		this.animalsNamesList.add("Sugar");
		this.animalsNamesList.add("Morgana");
		this.animalsNamesList.add("Plutus");
		this.animalsNamesList.add("Donald");
		this.animalsNamesList.add("Scooby Doo");
		this.animalsNamesList.add("Marley");
		this.animalsNamesList.add("Garfield");
		this.animalsNamesList.add("Lucifer");
		this.animalsNamesList.add("Cinnanom");
		this.animalsNamesList.add("Jerry");
		this.animalsNamesList.add("Tom");
		this.animalsNamesList.add("Mikey");
		this.animalsNamesList.add("Stuart Little");
		this.animalsNamesList.add("Donald");
		this.animalsNamesList.add("Peppa");
		this.animalsNamesList.add("Pixel");
		this.animalsNamesList.add("Kitty");
		this.animalsNamesList.add("Totó");
		this.animalsNamesList.add("Spook");
		this.animalsNamesList.add("Smelly");
		this.animalsNamesList.add("Pandora");
		this.animalsNamesList.add("Simba");
		this.animalsNamesList.add("Sassy");
		this.animalsNamesList.add("Bambi");
		this.animalsNamesList.add("Wix");
		this.animalsNamesList.add("Bunnie");
		this.animalsNamesList.add("Scar");
		this.animalsNamesList.add("Floyd");
		this.animalsNamesList.add("Neutron");
		this.animalsNamesList.add("Plasma");
		this.animalsNamesList.add("Mr. Spock");
		this.animalsNamesList.add("Vulcan");
		this.animalsNamesList.add("Porthos");
		
		
		
	}
	public String getRandomNames() {
		int listSize = this.animalsNamesList.size();
		Random r = new Random();
		int indexOfAnimalsNames = r.nextInt(listSize);
		
		String randomAnimalsNames = this.animalsNamesList.get(indexOfAnimalsNames);
		return randomAnimalsNames;
		}
	}


