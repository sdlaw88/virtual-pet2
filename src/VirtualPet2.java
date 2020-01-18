//cookie cutter
public class VirtualPet2 {

	private int thirst;
	private int hunger;
	private int bordom;
	private int apperance;
	private int health;
	private int enegry;
	
	public int getHunger() {
		return this.hunger;
	}

	public int getEnegry() {
		
		return this.enegry;
	}
	public int getThirst() {

		return this.thirst;
	}
	public int getApperance() {
		
		return this.apperance;
	}
	public int getHealth() {
		
		return this.health;
	}
	
	public int getBordom() {

		return this.bordom;
	}

	public void eat() {

		this.hunger--;
		this.health++;
	}

	public void drink() {

		this.thirst--;
	}

	public void play() {

		this.bordom--;
		this.apperance--;
		this.enegry=-2;
	}

	

	

	

	

	

}
