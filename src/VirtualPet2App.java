import java.util.Scanner;
public class VirtualPet2App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String petsName;
		String petDescription;
		System.out.println("Hello and welcome. You have a dog. What do you want to name your new dog?");
		petsName = input.nextLine();
		
		System.out.println("How would you describe your new dog?");
		petDescription= input.nextLine();
		
		//instantiate object
		VirtualPet2 myDog = new VirtualPet2(petsName,petDescription);
		
		System.out.println("Your dog has this level of hunger currently " + myDog.getHunger());
		
		
		//VirtualPet2 myDog = new VirtualPet2(thirst, hunger, bordom, apperance, health, enegry, petsName);
		
		
		
		//System.out.println("Your pets name is " + petsName + ". He is " + petDescription);
		
		
			
		

	}

}
