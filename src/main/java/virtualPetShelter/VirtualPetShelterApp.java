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

		System.out.println("Welcome to Catty Cat's Dog House.");
		System.out.println(
				"Here at Catty Cat's Dog House we'll turn the cat or dog of your dreams into the dog or cat or your dreams!");
		System.out.println(
				"Through use of our patented \'Cog Powder\' we'll turn little Fido into princess Shiba!  Come to our playpens and see it in action!\n(Press any to enter)");
		input.nextLine();
		System.out.println("Just look at those adorable little guys! They're mearking for your attention!");
		System.out.println("Feel free to love, play, or sprinkle them any time you want!");
		System.out.println(
				"And, guess what!?\nShould you find that special someone in our playpens, that special someone is all yours for a modest fee!");
		System.out.println(
				"And should you want to transmorph that special someone at home, just leave them with us for a few days. We'll have your cat barking in no time!");
		System.out.println("I'll leave you and little ones alone for now. Enjoy!\n(Press any key to continue)");
		input.nextLine();

		while (true) {
			System.out.println("\nList of creatures in the playpen and their attributes:\n");
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
				System.out.println("\nYou hug all the animals.  They give a tepid response.\n(Press any key)");
				input.nextLine();
				continue;
			} else if (option.equals("2")) {
				shelter.pokeAllCreatures();
				System.out.println("\nYou jab all creatures.  They give a tepid response.\n(Press any key)");
				input.nextLine();
				continue;
			} else if (option.equals("3")) {
				shelter.catAllCreatures();
				System.out.println(
						"\nYou sprinkle Cat Cog Powder on all the creatures.  Their tails are longer and ears pointer.\n(Press any key)");
				input.nextLine();
				continue;
			} else if (option.equals("4")) {
				shelter.dogAllCreatures();
				System.out.println(
						"\nYou sprinkle Dog Cog Powder on all the creatures.  Their ears are floppier and faces snoutier.\n(Press any key)");
				input.nextLine();
				continue;
			} else if (option.equals("5")) {
				System.out.println("\nWhich creature plays?");
				String name = input.nextLine();
				shelter.play(name);
				System.out.println(name + " plays like it has forgotten how to play\n(Press any key)");
				input.nextLine();
				continue;
			} else if (option.equals("6")) {
				System.out.println("What is this creature's name?");
				String name = input.nextLine();
				System.out.println("Describe this creature");
				String description = input.nextLine();
				VirtualPet intakeCreature = new VirtualPet(name, description);
				shelter.addCreature(intakeCreature);
				System.out.println(name + " misses it's old life.\n(Press any key)");
				input.nextLine();
				continue;
			} else if (option.equals("7")) {
				System.out.println("Which animal would you like to abscond with into the night?");
				String name = input.nextLine();
				VirtualPet creatureAdopted = shelter.getName(name);
				shelter.adoptCreature(creatureAdopted);
				System.out.println(name + " has a gleam of hope in its eyes");
				continue;
			} else if (option.equals("8")) {
				System.out.println("You leave this place for good.");
				System.exit(0);
			} else {
				System.out.println("Nope, not a thing.");
			}
			shelter.tickAllCreatures();
		}
	}
}