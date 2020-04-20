package pets;

public abstract class Animals {
	
	private String names;
	private int age;
	private boolean medicalCondition;
	
	public Animals() {
		
	}

	public Animals(String names, int age, boolean medicalCondition) {
		super();
		this.names = names;
		this.age = age;
		this.medicalCondition = medicalCondition;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(boolean medicalCondition) {
		this.medicalCondition = medicalCondition;
	}


	public String toString() {
		return (this.names);
	}
	

}
