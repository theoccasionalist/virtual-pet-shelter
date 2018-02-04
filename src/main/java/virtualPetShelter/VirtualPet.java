package virtualPetShelter;

import java.util.concurrent.ThreadLocalRandom;

public class VirtualPet {
	private String name;
	private String description;
	private int hatred;
	private int unrelentingLove;
	private int catness;
	private int dogness;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.hatred = ThreadLocalRandom.current().nextInt(1, 11);
		this.unrelentingLove = ThreadLocalRandom.current().nextInt(1, 11);
		this.catness = ThreadLocalRandom.current().nextInt(1, 11);
		this.dogness = ThreadLocalRandom.current().nextInt(1, 11);
	}

	public VirtualPet(String name, String description, int hatred, int unrelentingLove, int catness, int dogness) {
		this.name = name;
		this.description = description;
		this.hatred = hatred;
		this.unrelentingLove = unrelentingLove;
		this.catness = catness;
		this.dogness = dogness;
	}

	public void pokeCreature() {
		hatred++;
		unrelentingLove--;
	}

	public void hugCreature() {
		hatred--;
		unrelentingLove++;
	}

	public void catCreature() {
		catness++;
		dogness--;
	}

	public void dogCreature() {
		catness--;
		dogness++;
	}

	public void tickCreature() {
		hatred++;
		dogness--;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHatred() {
		return hatred;
	}

	public int getUnrelentingLove() {
		return unrelentingLove;
	}

	public int getCatness() {
		return catness;
	}

	public int getDogness() {
		return dogness;
	}

	@Override
	public String toString() {
		return String.format("%-17s%-25s%-17s%-17s%-17s%-17s", name, description, hatred, unrelentingLove, catness,
				dogness);
	}

}
