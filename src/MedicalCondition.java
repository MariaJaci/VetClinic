import java.util.ArrayList;
import java.util.Random;

final class MedicalCondition {

	private ArrayList<String> medicalCondition = new ArrayList<String>();

	public MedicalCondition() {
		this.medicalCondition.add("Carrot allergy");
		this.medicalCondition.add("Covid19");
		this.medicalCondition.add("Corona virus");
		this.medicalCondition.add("Flu");
		this.medicalCondition.add("vomiting");
		this.medicalCondition.add("Attacked by a dog");
		this.medicalCondition.add("influenza");
		this.medicalCondition.add("paralysed");
		this.medicalCondition.add("spotty liver");
		this.medicalCondition.add("fever");
		this.medicalCondition.add("ulcers");
		this.medicalCondition.add("respiratory distress");
		this.medicalCondition.add("coughing");
		this.medicalCondition.add("dead ");
		this.medicalCondition.add("drooling ");
		this.medicalCondition.add("deep smelly");
		this.medicalCondition.add("wounds");
		this.medicalCondition.add("blisters around the feet");
		this.medicalCondition.add("nervous");
		this.medicalCondition.add("abnormal behaviour");
		this.medicalCondition.add("salivating excessively");
		this.medicalCondition.add("diarrhoea");
		this.medicalCondition.add("pestivirus");
		this.medicalCondition.add("mucosal disease");
		this.medicalCondition.add("pregnant");
		this.medicalCondition.add("Campylobacter hepaticus");
		this.medicalCondition.add("Summer hepatitis");
		this.medicalCondition.add("Blindness");
		this.medicalCondition.add("Walking in circles");
		this.medicalCondition.add("Ear twitching");
		this.medicalCondition.add("Teeth grinding");
		this.medicalCondition.add("Stop producing milk");
		
	}

	public String getRandomMedicalCondition() {

		int listSize = this.medicalCondition.size();
		Random r = new Random(); // creation (instantiation) of class Random
		int indexOfMedicalCondition = r.nextInt(listSize); // generate random number (max listSize)

		// get the surname in position indexOfSurname
		String randomMedicalCondition = this.medicalCondition.get(indexOfMedicalCondition);
		return randomMedicalCondition;

	}

}
