package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal();
	dog.species = "dog";
	dog.name = "Denali";
	dog.weight = 40.0;
	dog.feed();

	Phone iPhone = new Phone();
	iPhone.producer = "Apple";
	iPhone.model = "7";
	iPhone.screenSize = 14.5;
	iPhone.operationSystem = "IOS";

	Human me = new Human();
	me.firstName = "Jakub";
	me.lastName = "Zejer";
	me.pet = dog;

	System.out.println("Zwierzak nazywa się" + me.pet.name);



    }
}
