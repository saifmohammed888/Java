package com.skilling.java.core;

public class AbstractTest extends AbstractionConcept{

	public static void main(String[] args) {
		AbstractTest Dog = new AbstractTest();
		System.out.println("Dog activity");
		Dog.AnimalSound("Dog");
		Dog.AnimalAction("Dog");
		
		System.out.println("\nCat activity");
		AbstractTest Cat = new AbstractTest();
		Cat.AnimalSound("Cat");
		Cat.AnimalAction("Cat");
	}

	@Override
	public void AnimalSound(String animal) {
		if(animal=="Dog")
			System.out.println("Wow Wow!! Wowww");
		else 
			System.out.println("Meowww, Meowww");
	}

	@Override
	public void AnimalAction(String animal) {
		if(animal=="Dog")
			System.out.println("Dog is running");
		else 
			System.out.println("Cat is drinking, milk");
	}

}
