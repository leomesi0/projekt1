package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal();
	dog.species = "cat";
	dog.name = "Ananas";
	dog.weight = 5.0;
	dog.feed();

	Phone iPhone = new Phone();
	iPhone.producer = "Apple";
	iPhone.model = "7";
	iPhone.screenSize = 14.5;
	iPhone.operationSystem = "IOS";
    }
}
