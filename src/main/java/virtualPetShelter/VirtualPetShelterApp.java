package virtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {

		VirtualPet creature1 = new VirtualPet("Stubby", "Stubby");
		VirtualPet creature2 = new VirtualPet("Talky", "Talkative");

		VirtualPetShelter shelter = new VirtualPetShelter();
		shelter.addCreature(creature1);
		shelter.addCreature(creature2);

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("List of creatures at Petty's Pet House and their attributes:\n");
			String format = String.format("%-17s%-25s%-17s%-17s%-17s%-17s", "Name", "Description", "Hatred", "Love",
					"Catness", "Dogness");
			System.out.println(format);
			System.out.println(
					"----------------------------------------------------------------------------------------------------");
			for (VirtualPet creature : shelter.petObjectValues()) {
				System.out.println(creature);
			}
			System.out.println();
			System.out.println("1: Hug all creatures");
			System.out.println("2: Jab all creatures");
			System.out.println("3: Cat all creatures");
			System.out.println("4: Dog all creatures");
			System.out.println("5: Play with a single creature");
			System.out.println("6: Abandon a creature at the shelter");
			System.out.println("7: Steal a creature from the shelter");
			System.out.println("8: Leave this place.");
			String option = input.nextLine();
			if (option.equals("1")) {
				shelter.hugAllCreatures();
				System.out.println("All pets hugged");
				continue;
			} else if (option.equals("2")) {
				shelter.pokeAllCreatures();
				System.out.println("All creatures poked");
				continue;
			} else if (option.equals("3")) {
				shelter.catAllCreatures();
				System.out.println("All creatures catted");
				continue;
			} else if (option.equals("4")) {
				shelter.dogAllCreatures();
				System.out.println("All creatures dogged");
				continue;
			} else if (option.equals("5")) {
				System.out.println("Which creature plays?");
				String name = input.nextLine();
				shelter.play(name);
				System.out.println(shelter.getName(name) + " plays");
				continue;
			} else if (option.equals("6")) {
				System.out.println("What is this creature's name?");
				String name = input.nextLine();
				System.out.println("Describe this creature");
				String description = input.nextLine();
				VirtualPet intakeCreature = new VirtualPet(name, description);
				shelter.addCreature(intakeCreature);
				System.out.println(shelter.getName(name) + " adopted");
				continue;
			} else if (option.equals("7")) {
				System.out.println("Which animal would you like to abscond with into the night?");
				String name = input.nextLine();
				VirtualPet creatureAdopted = shelter.getName(name);
				System.out.println("You absconded with " + name + ".");
				shelter.adoptCreature(creatureAdopted);
				continue;
			} else if (option.equals("8")) {
				System.out.println("Leave");
				System.exit(0);
			} else {
				System.out.println("Nope");
			}
			shelter.tickAllCreatures();
		}
	}
}