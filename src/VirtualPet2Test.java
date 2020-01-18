import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VirtualPet2Test {

	// It goes global here outside of @Test known as in instance variable
	//arrange
	VirtualPet2 underTest = new VirtualPet2(10, 10, 10, 10, 10, 10, "");// you can name it anything you want

	@Test
	public void hungerShouldBe0AtStart() {
		// Arrange
		VirtualPet2 fluffy = new VirtualPet2(0, 0, 0, 0, 0, 0, "");// you can name it anything you want

		// Act
		int result = fluffy.getHunger();
		// Assert

		assertEquals(0, result);
	}

	@Test
	public void thirstShouldBe0AtStart() {
		// Arrange
		VirtualPet2 fluffy = new VirtualPet2(0, 0, 0, 0, 0, 0, "");// you can name it anything you want

		
		// you can name it anything you want
		// you can make it global by putting it right under class

		// Act
		int result = fluffy.getThirst();
		// Assert
		assertEquals(0, result);
	}

	@Test
	public void bordomShouldBe0AtStart() {
		// Arrange
		VirtualPet2 fluffy = new VirtualPet2(0, 0, 0, 0, 0, 0, "");// you can name it anything you want

		// you can name it anything you want
		// Act
		int result = fluffy.getBordom();
		// Assert
		assertEquals(0, result);
	}

	@Test
	public void hungerShouldDecreaseBy1AfterEat() {
		// Arrange
		// Is now global and at the top of pace
		// Act
		int beforeEat = underTest.getHunger(); // Testing before hunger
		underTest.eat(); // we are just testing the method no need for "getter"
		int result = underTest.getHunger();// Test After eating

		// Assert
		assertEquals(beforeEat - 1, result);
	}

	@Test
	public void thirstShouldDecreaseby1AfterDrink() {
		// Arrange

		// Act
		int beforeDrink = underTest.getThirst();// Thirst level before drink
		underTest.drink(); // giving the drink
		int result = underTest.getThirst();
		// Assert
		assertEquals(beforeDrink - 1, result);
	}

	@Test
	public void bordomShouldDecreaseBy1AfterPlay() {
		// Arrange

		// Act
		int beforePlay = underTest.getBordom();
		underTest.play();
		int result = underTest.getBordom();
		// Assert
		assertEquals(beforePlay - 1, result);
	}

	@Test
	public void apperanceDecreaseBy1AfterPlay() {
		// Act
		int beforePlay = underTest.getApperance();
		underTest.play();
		int result = underTest.getApperance();

		// Assert
		assertEquals(beforePlay - 1, result);
	}

	@Test
	public void healthIncreaseby1AfterEat() {
		int afterEat = underTest.getHealth();
		underTest.eat();
		int result = underTest.getHealth();

		// Assert
		assertEquals(afterEat + 1, result);
	}

	@Test
	public void enegryDecreaseBy2AfterPlay() {
		int afterPlay = underTest.getEnegry();
		underTest.play();
		int result = underTest.getEnegry();

		assertEquals(afterPlay = -2, result);
	}

	@Test
	public void getPetsName() {
		String petsName = underTest.getPetsName();
		String result = petsName;
		assertEquals(petsName, result);

	}
	
	@Test
	public void justTestingDefaultConstructor() {
		//arrange
		VirtualPet2 defConstructor = new VirtualPet2();
		//act
		int result = defConstructor.getBordom();
		//assert
		assertEquals(0,result);
		
	
	}
	@Test
	public void justTestingNameAndDescriptionConstructorReturnsNameBob() {
		//arrange
		VirtualPet2 nameAndDescriptionObj = new VirtualPet2("Bob","A feral dog.");
		//act
		String result = nameAndDescriptionObj.getPetsName();
		//assert
		assertEquals("Bob",result);
		
	
	}
	
	@Test
	public void justTestingNameAndDescriptionConstructorReturnsNameJudy() {
		//arrange
		VirtualPet2 nameAndDescriptionObj = new VirtualPet2("Judy","A feral dog.");
		//act
		String result = nameAndDescriptionObj.getPetsName();
		//assert
		assertEquals("Judy",result);
		
	
	}
	
	
	
}
