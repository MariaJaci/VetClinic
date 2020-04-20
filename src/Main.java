import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import pets.Animals;
import pets.Cat;
import pets.Deer;
import pets.Dog;
import pets.Fox;
import pets.Rabbit;
import staff.Admin;
import staff.IT;
import staff.Medical;
import staff.Nurse;
import staff.Receptionist;
import staff.Staff;
import staff.Trainee;
import staff.Vet;

/*
 CONTINUOUS ASSESSMENT - Vet Clinic
 Software Development Fundamentals &
 Algorithms & Constructs
 HDIP in Computing (Sept 2019 cohort) 
 Student's name: Maria Jaciara Lagares ID 2019431
 Lecturer Name(s) Ken Healy & Amilcar Aponte
*/

public class Main {

	public static void main(String[] args) {

		int staffID = 1; // variable to store staff ids
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		ArrayList<Medical> nursesList = new ArrayList<Medical>();
		ArrayList<Admin> adminList = new ArrayList<Admin>();
		ArrayList<Medical> medicalList = new ArrayList<Medical>();
		ArrayList<Animals> animalsList = new ArrayList<Animals>();
		ArrayList<Animals> dogsList = new ArrayList<Animals>();

		// Instantiating the objects
		HumanNames humanNames = new HumanNames();
		HumanSurnames humanSurnames = new HumanSurnames();
		AnimalsNames animalsNames = new AnimalsNames();
		Random r = new Random();

		// loop for creating 5 vets
		for (int i = 1; i <= 5; i++) {
			// variable to store 5 random names/surnames from the class
			// humanNames/humanSurnames for the vets
			String firstName = humanNames.getRandomname();
			String surname = humanSurnames.getRandomSurname();
			double salary = (double) r.nextInt(5000); // Initiating staff salary

			Vet vet = new Vet(firstName, surname, staffID, salary); // instantiating the object
			staffList.add(vet); // method to add the newly created vet in the list of staff
			// ??? admin.addAll(admin); //method to list all admin staff by category???
			// ??? medical.addAll(medical);//method to list all medical staff by category???
			staffID++; // variable to store staff id ??? I don't know yet what to do with this staff ID???

		}

		// loop for creating 15 trainees
		for (int i = 1; i <= 15; i++) {
			String firstName = humanNames.getRandomname();
			String surname = humanSurnames.getRandomSurname();
			double salary = (double) r.nextInt(500);

			Trainee trainee = new Trainee(firstName, surname, staffID, salary);
			staffList.add(trainee); // add the newly created trainee in the list of trainees
			staffID++;
		}

		// loop for creating 10 nurses
		for (int i = 1; i <= 10; i++) {
			String firstName = humanNames.getRandomname();
			String surname = humanSurnames.getRandomSurname();
			double salary = (double) r.nextInt(500);

			Nurse nurse = new Nurse(firstName, surname, staffID, salary);
			staffList.add(nurse); // add the newly created nurse in the list of nurse
			nursesList.add(nurse); // method to list all nurses
			staffID++;

		}

		// loop for creating 8 ITs
		for (int i = 1; i <= 8; i++) {
			String firstName = humanNames.getRandomname();
			String surname = humanSurnames.getRandomSurname();
			double salary = (double) r.nextInt(500);

			IT it = new IT(firstName, surname, staffID, salary);
			staffList.add(it);
			staffID++;

		}

		// loop for creating 2 receptionists
		for (int i = 1; i <= 2; i++) {
			String firstName = humanNames.getRandomname();
			String surname = humanSurnames.getRandomSurname();
			double salary = (double) r.nextInt(500);

			Receptionist receptionist = new Receptionist(firstName, surname, staffID, salary);
			staffList.add(receptionist);
			staffID++;
		}
		// loop for creating 200 cats
		for (int j = 1; j <= 200; j++) {
			// variable to store the cats names from the class AnimalsNames
			String names = animalsNames.getRandomNames();
			int age = 1; // ???I don't know yet what to do with this int for the age???
			boolean medicalCondition = false; // ???I don't know yet what to do with boolean???

			Cat cat = new Cat(names, age, medicalCondition); // instantiating the object
			animalsList.add(cat); // add the newly created cat in the list of animals

		}
		// loop for creating 200 deers
		for (int j = 1; j <= 200; j++) {
			String names = animalsNames.getRandomNames();
			int age = 1;
			boolean medicalCondition = false;
			Deer deer = new Deer(names, age, medicalCondition);
			animalsList.add(deer); // add the newly created cat in the list of animals

		}
		// loop for creating 200 dogs
		for (int j = 1; j <= 200; j++) {
			String names = animalsNames.getRandomNames();
			int age = 1;
			boolean medicalCondition = false;
			Dog dog = new Dog(names, age, medicalCondition); // instantiating the object
			animalsList.add(dog); // method to add the dogs to animals list
			dogsList.add(dog); // method to list all dogs

		}
		// loop for creating 200 foxes
		for (int j = 1; j <= 200; j++) {
			String names = animalsNames.getRandomNames();
			int age = 1;
			boolean medicalCondition = false;
			Fox fox = new Fox(names, age, medicalCondition);
			animalsList.add(fox);

		}
		// loop for creating 200 rabbits
		for (int j = 1; j <= 200; j++) {
			String names = animalsNames.getRandomNames();
			int age = 1;
			boolean medicalCondition = false;
			Rabbit rabbit = new Rabbit(names, age, medicalCondition);
			animalsList.add(rabbit);

		}
		System.out.println("------WELCOME TO VET CLINIC-----");
		System.out.println("Please, press the number that corresponds to what you want to list.");
		System.out.println("Press 1 to List all staff");
		System.out.println("Press 2 to List staff by categories");
		System.out.println("Press 3 to list all Nurses");
		System.out.println("Press 4 to Search for a specific member of staff by name ");
		System.out.println("Press 5 to List all animals ");
		System.out.println("Press 6 to list all dogs");
		System.out.println("Press 7 to Search for a specific animal by name");
		System.out.println("Press 8 to list all Admin staff performing a certain task");
		System.out.println("Press 9 to exit.");

		Scanner input = new Scanner(System.in); // to get the user input
		// ask for a number that corresponds to the user choice for the menu above
		int option = input.nextInt();
		while (option != 9) {
			switch (option) {
			case 1:
				System.out.println("All staff: " + staffList);
				break;
			case 2:
				System.out.println();
				break;
			case 3:
				System.out.println("All nurses: " + nursesList);
				break;
			case 4:
				System.out.println();
				break;
			case 5:
				System.out.println("All animals: " + animalsList); // ??? why sometimes it works sometimes it doesn't???
				break;
			case 6:
				System.out.println("All dogs: " + dogsList);
				break;
			case 7:
				System.out.println();
				break;
			case 8:
				System.out.println();
				break;
			default:
				System.out.println("Please, choose a number from 1 to 9, according to what you want.");
			}
			option = input.nextInt(); // ask for a number
		}
		System.out.println("Thank you!"); // this message appears when the user exit
	}
}
