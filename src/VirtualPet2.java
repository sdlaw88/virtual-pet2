//cookie cutter template (blueprint)
public class VirtualPet2 {

	private int thirst=0;
	private int hunger=0;
	private int bordom=0;
	private int apperance = 0;
	private int health = 0;
	private int enegry = 0;
	private String petsName = "";
	private String petDescription = "";
	
	
	public VirtualPet2  (int thirst, int hunger, int bordom, int apperance, int health, int enegry, String petsName) {
		this.thirst = thirst;
		this.hunger = hunger;
		this.bordom = bordom;
		this.apperance = apperance;
		this.health = health;
		this.enegry = enegry;
		this.petsName = petsName;
		
		
	}
	
	public VirtualPet2() {
		
	}
	
	public VirtualPet2(int thirst, int hunger, int bordom) {//math random constructor
		this.thirst = thirst++;
		this.hunger = hunger++;
		this.bordom = bordom++;
	}



	public VirtualPet2(String nameParameter, String descriptionParameter) {
		this.petsName = nameParameter;
		this.petDescription = descriptionParameter;
		
	}



	public String getPetsName() {
		
		return this.petsName;
	}
	
	
	
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
