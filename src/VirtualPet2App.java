import java.util.Scanner;
public class VirtualPet2App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet2 myPet = new VirtualPet2 ((int)(Math.random() * 10)+1, (int)(Math.random()* 10)+1,
				(int)(Math.random() * 10)+1);
		String petsName;
		String petDescription;
		System.out.println("Hello and welcome." + "\nYou have a dog." + "\nWhat do you want to name your new dog?");
		petsName = input.nextLine();
		
		System.out.println("How would you describe your new dog?");
		petDescription= input.nextLine();
		
		//instantiate object
		VirtualPet2 myDog = new VirtualPet2(petsName,petDescription);
		
		System.out.println("Your dog has this level of hunger currently " + myPet.getHunger());
		System.out.println("Your dog has a thirst level of "+ myPet.getThirst());
		System.out.println("Your dog has boredom level of "+ myPet.getBordom());
		
		System.out.println("How would you like to make " + petsName + "happy?");
		System.out.println("Press 1 to feed your pet");
		System.out.println("Press 2 to give your pet water");
		System.out.println("Press 3 to play with your pet");
		String menuOption = input.nextLine();
		
		if(menuOption.equals("1")) {
			System.out.println("You fed " + petsName + " Blue Ribbon.");
			System.out.println(petsName + " hunger level is " + myPet.getHunger());
		
		}if(menuOption.equals("2")) {
			System.out.println("You gave " + petsName + " toilet water.");
			System.out.println(petsName + " thirst level is " + myPet.getThirst());
		}
		
		//VirtualPet2 myDog = new VirtualPet2(thirst, hunger, bordom, apperance, health, enegry, petsName);
		
		
		
		//System.out.println("Your pets name is " + petsName + ". He is " + petDescription);
		
		
			
		

	}

}
